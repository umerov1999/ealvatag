package ealvatag.issues;

import ealvatag.AbstractTestCase;
import ealvatag.audio.AudioFile;
import ealvatag.audio.AudioFileIO;
import ealvatag.audio.AudioHeader;
import ealvatag.audio.aiff.AiffAudioHeader;
import ealvatag.audio.wav.WavOptions;
import ealvatag.audio.wav.WavSaveOptions;
import ealvatag.tag.FieldKey;
import ealvatag.tag.NullTag;
import ealvatag.tag.Tag;
import ealvatag.tag.TagOptionSingleton;

import java.io.File;

/**
 * #119:https://bitbucket.org/ijabz/jaudiotagger/issues/119/wav-aiff-add-padding-byte-if-missing-in
 */
public class Issue093Test extends AbstractTestCase
{
    public void testWriteAiffWithCorruptID3Tag1()
    {
        Exception exceptionCaught = null;

        File orig = new File("testdata", "test145.aiff");
        if (!orig.isFile())
        {
            System.err.println("Unable to test file - not available");
            return;
        }


        File testFile = AbstractTestCase.copyAudioToTmp("test145.aiff", new File("test145CorruptedID3.aiff"));
        try
        {
            AudioFile f = AudioFileIO.read(testFile);
            AudioHeader ah = f.getAudioHeader();
            assertTrue(ah instanceof AiffAudioHeader);
            Tag tag = f.getTag().or(NullTag.INSTANCE);
            System.out.println(tag);
            f.getTag().or(NullTag.INSTANCE).setField(FieldKey.ARTIST,"Jonathon");
            f.save();
            f = AudioFileIO.read(testFile);
            tag = f.getTag().or(NullTag.INSTANCE);
            System.out.println(tag);
            assertEquals("Jonathon",tag.getFirst(FieldKey.ARTIST));
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            exceptionCaught = ex;
        }
        assertNull(exceptionCaught);
    }

    public void testWriteAiffWithCorruptID3Tag2() {

        Exception exceptionCaught = null;

        File orig = new File("testdata", "test152.aiff");
        if (!orig.isFile())
        {
            System.err.println("Unable to test file - not available");
            return;
        }


        File testFile = AbstractTestCase.copyAudioToTmp("test152.aiff", new File("test152MissingByteId3.aiff"));
        try
        {
            AudioFile f = AudioFileIO.read(testFile);
            AudioHeader ah = f.getAudioHeader();
            assertTrue(ah instanceof AiffAudioHeader);
            Tag tag = f.getTag().or(NullTag.INSTANCE);
            System.out.println(tag);
            f.getTag().or(NullTag.INSTANCE).setField(FieldKey.ARTIST,"fred");
            f.save();
            f = AudioFileIO.read(testFile);
            tag = f.getTag().or(NullTag.INSTANCE);
            System.out.println(tag);
           assertEquals("fred",tag.getFirst(FieldKey.ARTIST));

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            exceptionCaught = ex;
        }
        assertNull(exceptionCaught);
    }

    public void testNaimRipMultipleTagsFixId3()
    {
        File orig = new File("testdata", "test152.wav");
        if (!orig.isFile())
        {
            System.err.println("Unable to test file - not available");
            return;
        }

        TagOptionSingleton.getInstance().setWavOptions(WavOptions.READ_ID3_ONLY);
        TagOptionSingleton.getInstance().setWavSaveOptions(WavSaveOptions.SAVE_ACTIVE);

        Exception exceptionCaught = null;
        try
        {
            File testFile = AbstractTestCase.copyAudioToTmp("test152.wav", new File("test152_id3.wav"));
            AudioFile f = AudioFileIO.read(testFile);
            System.out.println(f.getAudioHeader());
            System.out.println(f.getTag());
            f.getTag().or(NullTag.INSTANCE).setField(FieldKey.ARTIST,"fred");
            f.save();
            f = AudioFileIO.read(testFile);
            Tag tag = f.getTag().or(NullTag.INSTANCE);
            System.out.println(tag);
            assertEquals("fred",tag.getFirst(FieldKey.ARTIST));

        }
        catch (Exception e)
        {
            e.printStackTrace();
            exceptionCaught = e;
        }
        assertNull(exceptionCaught);
    }

    public void testNaimRipMultipleFixTagsInfo()
    {
        File orig = new File("testdata", "test152.wav");
        if (!orig.isFile())
        {
            System.err.println("Unable to test file - not available");
            return;
        }

        TagOptionSingleton.getInstance().setWavOptions(WavOptions.READ_INFO_ONLY);
        TagOptionSingleton.getInstance().setWavSaveOptions(WavSaveOptions.SAVE_ACTIVE);

        Exception exceptionCaught = null;
        try
        {
            File testFile = AbstractTestCase.copyAudioToTmp("test152.wav", new File("test152_info.wav"));
            AudioFile f = AudioFileIO.read(testFile);
            System.out.println(f.getAudioHeader());
            System.out.println(f.getTag());
            f.getTag().or(NullTag.INSTANCE).setField(FieldKey.ARTIST,"fred");
            f.save();
            f = AudioFileIO.read(testFile);
            Tag tag = f.getTag().or(NullTag.INSTANCE);
            System.out.println(tag);
            assertEquals("fred",tag.getFirst(FieldKey.ARTIST));

        }
        catch (Exception e)
        {
            e.printStackTrace();
            exceptionCaught = e;
        }
        assertNull(exceptionCaught);
    }

    public void testNaimRipMultipleFixTagsExistingId3()
    {
        File orig = new File("testdata", "test152.wav");
        if (!orig.isFile())
        {
            System.err.println("Unable to test file - not available");
            return;
        }

        TagOptionSingleton.getInstance().setWavOptions(WavOptions.READ_ID3_ONLY);
        TagOptionSingleton.getInstance().setWavSaveOptions(WavSaveOptions.SAVE_EXISTING_AND_ACTIVE);

        Exception exceptionCaught = null;
        try
        {
            File testFile = AbstractTestCase.copyAudioToTmp("test152.wav", new File("test152_existing_id3.wav"));
            AudioFile f = AudioFileIO.read(testFile);
            System.out.println(f.getAudioHeader());
            System.out.println(f.getTag());
            f.getTag().or(NullTag.INSTANCE).setField(FieldKey.ARTIST,"fred");
            f.save();
            f = AudioFileIO.read(testFile);
            Tag tag = f.getTag().or(NullTag.INSTANCE);
            System.out.println(tag);
            assertEquals("fred",tag.getFirst(FieldKey.ARTIST));

        }
        catch (Exception e)
        {
            e.printStackTrace();
            exceptionCaught = e;
        }
        assertNull(exceptionCaught);
    }

    public void testNaimRipMultipleFixTagsExistingInfo()
    {
        File orig = new File("testdata", "test152.wav");
        if (!orig.isFile())
        {
            System.err.println("Unable to test file - not available");
            return;
        }

        TagOptionSingleton.getInstance().setWavOptions(WavOptions.READ_INFO_ONLY);
        TagOptionSingleton.getInstance().setWavSaveOptions(WavSaveOptions.SAVE_EXISTING_AND_ACTIVE);

        Exception exceptionCaught = null;
        try
        {
            File testFile = AbstractTestCase.copyAudioToTmp("test152.wav", new File("test152_existing_info.wav"));
            AudioFile f = AudioFileIO.read(testFile);
            System.out.println(f.getAudioHeader());
            System.out.println(f.getTag());
            f.getTag().or(NullTag.INSTANCE).setField(FieldKey.ARTIST,"fred");
            f.save();
            f = AudioFileIO.read(testFile);
            Tag tag = f.getTag().or(NullTag.INSTANCE);
            System.out.println(tag);
            assertEquals("fred",tag.getFirst(FieldKey.ARTIST));

        }
        catch (Exception e)
        {
            e.printStackTrace();
            exceptionCaught = e;
        }
        assertNull(exceptionCaught);
    }

    public void testNaimRipMultipleTagsFixId3Both()
    {
        File orig = new File("testdata", "test152.wav");
        if (!orig.isFile())
        {
            System.err.println("Unable to test file - not available");
            return;
        }

        TagOptionSingleton.getInstance().setWavOptions(WavOptions.READ_ID3_ONLY);
        TagOptionSingleton.getInstance().setWavSaveOptions(WavSaveOptions.SAVE_BOTH);

        Exception exceptionCaught = null;
        try
        {
            File testFile = AbstractTestCase.copyAudioToTmp("test152.wav", new File("test152_existing_id3_both.wav"));
            AudioFile f = AudioFileIO.read(testFile);
            System.out.println(f.getAudioHeader());
            System.out.println(f.getTag());
            f.getTag().or(NullTag.INSTANCE).setField(FieldKey.ARTIST,"fred");
            f.save();
            f = AudioFileIO.read(testFile);
            Tag tag = f.getTag().or(NullTag.INSTANCE);
            System.out.println(tag);
            assertEquals("fred",tag.getFirst(FieldKey.ARTIST));

        }
        catch (Exception e)
        {
            e.printStackTrace();
            exceptionCaught = e;
        }
        assertNull(exceptionCaught);
    }

    public void testNaimRipMultipleFixTagsInfoBoth()
    {
        File orig = new File("testdata", "test152.wav");
        if (!orig.isFile())
        {
            System.err.println("Unable to test file - not available");
            return;
        }

        TagOptionSingleton.getInstance().setWavOptions(WavOptions.READ_INFO_ONLY);
        TagOptionSingleton.getInstance().setWavSaveOptions(WavSaveOptions.SAVE_BOTH);

        Exception exceptionCaught = null;
        try
        {
            File testFile = AbstractTestCase.copyAudioToTmp("test152.wav", new File("test152_existing_info_both.wav"));
            AudioFile f = AudioFileIO.read(testFile);
            System.out.println(f.getAudioHeader());
            System.out.println(f.getTag());
            f.getTag().or(NullTag.INSTANCE).setField(FieldKey.ARTIST,"fred");
            f.save();
            f = AudioFileIO.read(testFile);
            Tag tag = f.getTag().or(NullTag.INSTANCE);
            System.out.println(tag);
            assertEquals("fred",tag.getFirst(FieldKey.ARTIST));

        }
        catch (Exception e)
        {
            e.printStackTrace();
            exceptionCaught = e;
        }
        assertNull(exceptionCaught);
    }

    public void testNaimRipMultipleTagsFixId3BothSync()
    {
        File orig = new File("testdata", "test152.wav");
        if (!orig.isFile())
        {
            System.err.println("Unable to test file - not available");
            return;
        }

        TagOptionSingleton.getInstance().setWavOptions(WavOptions.READ_ID3_ONLY);
        TagOptionSingleton.getInstance().setWavSaveOptions(WavSaveOptions.SAVE_BOTH_AND_SYNC);

        Exception exceptionCaught = null;
        try
        {
            File testFile = AbstractTestCase.copyAudioToTmp("test152.wav", new File("test152_existing_id3_both_sync.wav"));
            AudioFile f = AudioFileIO.read(testFile);
            System.out.println(f.getAudioHeader());
            System.out.println(f.getTag());
            f.getTag().or(NullTag.INSTANCE).setField(FieldKey.ARTIST,"fred");
            f.save();
            f = AudioFileIO.read(testFile);
            Tag tag = f.getTag().or(NullTag.INSTANCE);
            System.out.println(tag);
            assertEquals("fred",tag.getFirst(FieldKey.ARTIST));

        }
        catch (Exception e)
        {
            e.printStackTrace();
            exceptionCaught = e;
        }
        assertNull(exceptionCaught);
    }

    public void testNaimRipMultipleFixTagsInfoBothSync()
    {
        File orig = new File("testdata", "test152.wav");
        if (!orig.isFile())
        {
            System.err.println("Unable to test file - not available");
            return;
        }

        TagOptionSingleton.getInstance().setWavOptions(WavOptions.READ_INFO_ONLY);
        TagOptionSingleton.getInstance().setWavSaveOptions(WavSaveOptions.SAVE_BOTH_AND_SYNC);

        Exception exceptionCaught = null;
        try
        {
            File testFile = AbstractTestCase.copyAudioToTmp("test152.wav", new File("test152_existing_info_both_sync.wav"));
            AudioFile f = AudioFileIO.read(testFile);
            System.out.println(f.getAudioHeader());
            System.out.println(f.getTag());
            f.getTag().or(NullTag.INSTANCE).setField(FieldKey.ARTIST,"fred");
            f.save();
            f = AudioFileIO.read(testFile);
            Tag tag = f.getTag().or(NullTag.INSTANCE);
            System.out.println(tag);
            assertEquals("fred",tag.getFirst(FieldKey.ARTIST));

        }
        catch (Exception e)
        {
            e.printStackTrace();
            exceptionCaught = e;
        }
        assertNull(exceptionCaught);
    }
}