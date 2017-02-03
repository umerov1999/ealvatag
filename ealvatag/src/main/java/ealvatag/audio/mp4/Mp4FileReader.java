/*
 * Entagged Audio Tag library
 * Copyright (c) 2003-2005 Raphaël Slinckx <raphael@slinckx.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package ealvatag.audio.mp4;

import ealvatag.audio.AudioFile;
import ealvatag.audio.AudioFileImpl;
import ealvatag.audio.exceptions.CannotReadException;
import ealvatag.audio.AudioFileReader;
import ealvatag.audio.GenericAudioHeader;
import ealvatag.audio.io.FileOperator;
import ealvatag.tag.TagFieldContainer;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Mp4 File Reader
 *
 * <p>This can read files containing either the .mp4 or .m4a suffixes
 */
public class Mp4FileReader extends AudioFileReader
{
    private Mp4InfoReader ir = new Mp4InfoReader();
    private Mp4TagReader tr = new Mp4TagReader();

    protected GenericAudioHeader getEncodingInfo(RandomAccessFile raf) throws CannotReadException, IOException
    {
        return ir.read(raf);
    }

    protected TagFieldContainer getTag(RandomAccessFile raf) throws CannotReadException, IOException
    {
        return tr.read(raf);
    }

    @Override protected AudioFile makeAudioFile(final RandomAccessFile raf, final File file, final String extension)
            throws CannotReadException, IOException {
        FileOperator fileOperator = new FileOperator(raf.getChannel());
        GenericAudioHeader info = ir.read(fileOperator);
        fileOperator.getFileChannel().position(0);  // TODO: 2/2/17 remove this when sure it's not needed after refactor
        return new AudioFileImpl(file, extension, info, tr.read(raf));
    }
}
