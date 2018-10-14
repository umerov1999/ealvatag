package ealvatag.tag.id3;

import com.google.common.base.Preconditions;
import ealvatag.tag.id3.framebody.FrameBodyCOMM;
import ealvatag.tag.id3.framebody.FrameBodyTXXX;
import ealvatag.tag.id3.framebody.FrameBodyUFID;
import ealvatag.tag.id3.framebody.FrameBodyWXXX;
import ealvatag.tag.id3.valuepair.StandardIPLSKey;
import org.jetbrains.annotations.NotNull;

/**
 * List of known id3v24 metadata fields
 *
 * <p>These provide a mapping from the generic key to the underlying ID3v24frames. For example most of the Musicbrainz
 * fields are implemented using a User Defined Text Info Frame, but with a different description key, so this
 * enum provides the link between the two.
 */
@SuppressWarnings("SpellCheckingInspection")
public enum ID3v24FieldKey {
  ACOUSTID_FINGERPRINT(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.ACOUSTID_FINGERPRINT, Id3FieldType.TEXT),
  ACOUSTID_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.ACOUSTID_ID, Id3FieldType.TEXT),
  ALBUM(ID3v24Frames.FRAME_ID_ALBUM, Id3FieldType.TEXT),
  ALBUM_ARTIST(ID3v24Frames.FRAME_ID_ACCOMPANIMENT, Id3FieldType.TEXT),
  ALBUM_ARTIST_SORT(ID3v24Frames.FRAME_ID_ALBUM_ARTIST_SORT_ORDER_ITUNES, Id3FieldType.TEXT),
  ALBUM_ARTISTS(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.ALBUM_ARTISTS, Id3FieldType.TEXT),
  ALBUM_ARTISTS_SORT(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.ALBUM_ARTISTS_SORT, Id3FieldType.TEXT),
  ALBUM_SORT(ID3v24Frames.FRAME_ID_ALBUM_SORT_ORDER, Id3FieldType.TEXT),
  AMAZON_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.AMAZON_ASIN, Id3FieldType.TEXT),
  ARRANGER(ID3v24Frames.FRAME_ID_INVOLVED_PEOPLE, StandardIPLSKey.ARRANGER.getKey(), Id3FieldType.TEXT),
  ARRANGER_SORT(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.ARRANGER_SORT, Id3FieldType.TEXT),
  ARTIST(ID3v24Frames.FRAME_ID_ARTIST, Id3FieldType.TEXT),
  ARTISTS(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.ARTISTS, Id3FieldType.TEXT),
  ARTISTS_SORT(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.ARTISTS_SORT, Id3FieldType.TEXT),
  ARTIST_SORT(ID3v24Frames.FRAME_ID_ARTIST_SORT_ORDER, Id3FieldType.TEXT),
  BARCODE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.BARCODE, Id3FieldType.TEXT),
  BPM(ID3v24Frames.FRAME_ID_BPM, Id3FieldType.TEXT),
  CATALOG_NO(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.CATALOG_NO, Id3FieldType.TEXT),
  CHOIR(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.CHOIR, Id3FieldType.TEXT),
  CHOIR_SORT(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.CHOIR_SORT, Id3FieldType.TEXT),
  CLASSICAL_CATALOG(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.CLASSICAL_CATALOG, Id3FieldType.TEXT),
  CLASSICAL_NICKNAME(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.CLASSICAL_NICKNAME, Id3FieldType.TEXT),
  COMMENT(ID3v24Frames.FRAME_ID_COMMENT, Id3FieldType.TEXT),
  COMPOSER(ID3v24Frames.FRAME_ID_COMPOSER, Id3FieldType.TEXT),
  COMPOSER_SORT(ID3v24Frames.FRAME_ID_COMPOSER_SORT_ORDER_ITUNES, Id3FieldType.TEXT),
  CONDUCTOR(ID3v24Frames.FRAME_ID_CONDUCTOR, Id3FieldType.TEXT),
  CONDUCTOR_SORT(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.CONDUCTOR_SORT, Id3FieldType.TEXT),
  COUNTRY(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.COUNTRY, Id3FieldType.TEXT),
  COVER_ART(ID3v24Frames.FRAME_ID_ATTACHED_PICTURE, Id3FieldType.BINARY),
  CUSTOM1(ID3v24Frames.FRAME_ID_COMMENT, FrameBodyCOMM.MM_CUSTOM1, Id3FieldType.TEXT),
  CUSTOM2(ID3v24Frames.FRAME_ID_COMMENT, FrameBodyCOMM.MM_CUSTOM2, Id3FieldType.TEXT),
  CUSTOM3(ID3v24Frames.FRAME_ID_COMMENT, FrameBodyCOMM.MM_CUSTOM3, Id3FieldType.TEXT),
  CUSTOM4(ID3v24Frames.FRAME_ID_COMMENT, FrameBodyCOMM.MM_CUSTOM4, Id3FieldType.TEXT),
  CUSTOM5(ID3v24Frames.FRAME_ID_COMMENT, FrameBodyCOMM.MM_CUSTOM5, Id3FieldType.TEXT),
  DISC_NO(ID3v24Frames.FRAME_ID_SET, Id3FieldType.TEXT),
  DISC_SUBTITLE(ID3v24Frames.FRAME_ID_SET_SUBTITLE, Id3FieldType.TEXT),
  DISC_TOTAL(ID3v24Frames.FRAME_ID_SET, Id3FieldType.TEXT),
  DJMIXER(ID3v24Frames.FRAME_ID_INVOLVED_PEOPLE, StandardIPLSKey.DJMIXER.getKey(), Id3FieldType.TEXT),
  ENCODER(ID3v24Frames.FRAME_ID_ENCODEDBY, Id3FieldType.TEXT),
  ENGINEER(ID3v24Frames.FRAME_ID_INVOLVED_PEOPLE, StandardIPLSKey.ENGINEER.getKey(), Id3FieldType.TEXT),
  ENSEMBLE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.ENSEMBLE, Id3FieldType.TEXT),
  ENSEMBLE_SORT(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.ENSEMBLE_SORT, Id3FieldType.TEXT),
  FBPM(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.FBPM, Id3FieldType.TEXT),
  GENRE(ID3v24Frames.FRAME_ID_GENRE, Id3FieldType.TEXT),
  GROUPING(ID3v24Frames.FRAME_ID_CONTENT_GROUP_DESC, Id3FieldType.TEXT),
  INVOLVED_PERSON(ID3v24Frames.FRAME_ID_INVOLVED_PEOPLE, Id3FieldType.TEXT),
  ISRC(ID3v24Frames.FRAME_ID_ISRC, Id3FieldType.TEXT),
  IS_CLASSICAL(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.IS_CLASSICAL, Id3FieldType.TEXT),
  IS_COMPILATION(ID3v24Frames.FRAME_ID_IS_COMPILATION, Id3FieldType.TEXT),
  IS_SOUNDTRACK(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.IS_SOUNDTRACK, Id3FieldType.TEXT),
  ITUNES_GROUPING(ID3v24Frames.FRAME_ID_ITUNES_GROUPING, Id3FieldType.TEXT),
  KEY(ID3v24Frames.FRAME_ID_INITIAL_KEY, Id3FieldType.TEXT),
  LANGUAGE(ID3v24Frames.FRAME_ID_LANGUAGE, Id3FieldType.TEXT),
  LYRICIST(ID3v24Frames.FRAME_ID_LYRICIST, Id3FieldType.TEXT),
  LYRICS(ID3v24Frames.FRAME_ID_UNSYNC_LYRICS, Id3FieldType.TEXT),
  MEDIA(ID3v24Frames.FRAME_ID_MEDIA_TYPE, Id3FieldType.TEXT),
  MIXER(ID3v24Frames.FRAME_ID_INVOLVED_PEOPLE, StandardIPLSKey.MIXER.getKey(), Id3FieldType.TEXT),
  MOOD(ID3v24Frames.FRAME_ID_MOOD, Id3FieldType.TEXT),
  MOOD_ACOUSTIC(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MOOD_ACOUSTIC, Id3FieldType.TEXT),
  MOOD_AGGRESSIVE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MOOD_AGGRESSIVE, Id3FieldType.TEXT),
  MOOD_AROUSAL(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MOOD_AROUSAL, Id3FieldType.TEXT),
  MOOD_DANCEABILITY(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MOOD_DANCEABILITY, Id3FieldType.TEXT),
  MOOD_ELECTRONIC(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MOOD_ELECTRONIC, Id3FieldType.TEXT),
  MOOD_HAPPY(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MOOD_HAPPY, Id3FieldType.TEXT),
  MOOD_INSTRUMENTAL(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MOOD_INSTRUMENTAL, Id3FieldType.TEXT),
  MOOD_PARTY(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MOOD_PARTY, Id3FieldType.TEXT),
  MOOD_RELAXED(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MOOD_RELAXED, Id3FieldType.TEXT),
  MOOD_SAD(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MOOD_SAD, Id3FieldType.TEXT),
  MOOD_VALENCE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MOOD_VALENCE, Id3FieldType.TEXT),
  MOVEMENT(ID3v24Frames.FRAME_ID_MOVEMENT, Id3FieldType.TEXT),
  MOVEMENT_NO(ID3v24Frames.FRAME_ID_MOVEMENT_NO, Id3FieldType.TEXT),
  MOVEMENT_TOTAL(ID3v24Frames.FRAME_ID_MOVEMENT_NO, Id3FieldType.TEXT),
  MUSICBRAINZ_ARTISTID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_ARTISTID, Id3FieldType.TEXT),
  MUSICBRAINZ_DISC_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_DISCID, Id3FieldType.TEXT),
  MUSICBRAINZ_ORIGINAL_RELEASEID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_ORIGINAL_ALBUMID, Id3FieldType.TEXT),
  MUSICBRAINZ_RELEASEARTISTID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_ALBUM_ARTISTID, Id3FieldType.TEXT),
  MUSICBRAINZ_RELEASEID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_ALBUMID, Id3FieldType.TEXT),
  MUSICBRAINZ_RELEASE_COUNTRY(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_ALBUM_COUNTRY, Id3FieldType.TEXT),
  MUSICBRAINZ_RELEASE_GROUP_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_RELEASE_GROUPID, Id3FieldType.TEXT),
  MUSICBRAINZ_RELEASE_STATUS(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_ALBUM_STATUS, Id3FieldType.TEXT),
  MUSICBRAINZ_RELEASE_TRACK_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_RELEASE_TRACKID, Id3FieldType.TEXT),
  MUSICBRAINZ_RELEASE_TYPE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_ALBUM_TYPE, Id3FieldType.TEXT),
  MUSICBRAINZ_TRACK_ID(ID3v24Frames.FRAME_ID_UNIQUE_FILE_ID, FrameBodyUFID.UFID_MUSICBRAINZ, Id3FieldType.TEXT),
  MUSICBRAINZ_WORK_COMPOSITION_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO,
                                  FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION_ID,
                                  Id3FieldType.TEXT),
  MUSICBRAINZ_WORK_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORKID, Id3FieldType.TEXT),
  MUSICBRAINZ_WORK_PART_LEVEL1_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO,
                                  FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_ID,
                                  Id3FieldType.TEXT),
  MUSICBRAINZ_WORK_PART_LEVEL2_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO,
                                  FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_ID,
                                  Id3FieldType.TEXT),
  MUSICBRAINZ_WORK_PART_LEVEL3_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO,
                                  FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_ID,
                                  Id3FieldType.TEXT),
  MUSICBRAINZ_WORK_PART_LEVEL4_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO,
                                  FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_ID,
                                  Id3FieldType.TEXT),
  MUSICBRAINZ_WORK_PART_LEVEL5_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO,
                                  FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_ID,
                                  Id3FieldType.TEXT),
  MUSICBRAINZ_WORK_PART_LEVEL6_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO,
                                  FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_ID,
                                  Id3FieldType.TEXT),
  MUSICIP_ID(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICIP_ID, Id3FieldType.TEXT),
  OCCASION(ID3v24Frames.FRAME_ID_COMMENT, FrameBodyCOMM.MM_OCCASION, Id3FieldType.TEXT),
  OPUS(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.OPUS, Id3FieldType.TEXT),
  ORCHESTRA(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.ORCHESTRA, Id3FieldType.TEXT),
  ORCHESTRA_SORT(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.ORCHESTRA_SORT, Id3FieldType.TEXT),
  ORIGINAL_ALBUM(ID3v24Frames.FRAME_ID_ORIG_TITLE, Id3FieldType.TEXT),
  ORIGINAL_ARTIST(ID3v24Frames.FRAME_ID_ORIGARTIST, Id3FieldType.TEXT),
  ORIGINAL_LYRICIST(ID3v24Frames.FRAME_ID_ORIG_LYRICIST, Id3FieldType.TEXT),
  ORIGINAL_YEAR(ID3v24Frames.FRAME_ID_ORIGINAL_RELEASE_TIME, Id3FieldType.TEXT),
  PART(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.PART, Id3FieldType.TEXT),
  PART_NUMBER(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.PART_NUMBER, Id3FieldType.TEXT),
  PART_TYPE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.PART_TYPE, Id3FieldType.TEXT),
  PERFORMER(ID3v24Frames.FRAME_ID_MUSICIAN_CREDITS, Id3FieldType.TEXT),
  PERFORMER_NAME(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.PERFORMER_NAME, Id3FieldType.TEXT),
  PERFORMER_NAME_SORT(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.PERFORMER_NAME_SORT, Id3FieldType.TEXT),
  PERIOD(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.PERIOD, Id3FieldType.TEXT),
  PRODUCER(ID3v24Frames.FRAME_ID_INVOLVED_PEOPLE, StandardIPLSKey.PRODUCER.getKey(), Id3FieldType.TEXT),
  QUALITY(ID3v24Frames.FRAME_ID_COMMENT, FrameBodyCOMM.MM_QUALITY, Id3FieldType.TEXT),
  RANKING(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.RANKING, Id3FieldType.TEXT),
  RATING(ID3v24Frames.FRAME_ID_POPULARIMETER, Id3FieldType.TEXT),
  RECORD_LABEL(ID3v24Frames.FRAME_ID_PUBLISHER, Id3FieldType.TEXT),
  REMIXER(ID3v24Frames.FRAME_ID_REMIXED, Id3FieldType.TEXT),
  SCRIPT(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.SCRIPT, Id3FieldType.TEXT),
  SINGLE_DISC_TRACK_NO(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.SINGLE_DISC_TRACK_NO, Id3FieldType.TEXT),
  SUBTITLE(ID3v24Frames.FRAME_ID_TITLE_REFINEMENT, Id3FieldType.TEXT),
  TAGS(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.TAGS, Id3FieldType.TEXT),
  TEMPO(ID3v24Frames.FRAME_ID_COMMENT, FrameBodyCOMM.MM_TEMPO, Id3FieldType.TEXT),
  TIMBRE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.TIMBRE, Id3FieldType.TEXT),
  TITLE(ID3v24Frames.FRAME_ID_TITLE, Id3FieldType.TEXT),
  TITLE_MOVEMENT(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.TITLE_MOVEMENT, Id3FieldType.TEXT),
  MUSICBRAINZ_WORK(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK, Id3FieldType.TEXT),
  TITLE_SORT(ID3v24Frames.FRAME_ID_TITLE_SORT_ORDER, Id3FieldType.TEXT),
  TONALITY(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.TONALITY, Id3FieldType.TEXT),
  TRACK(ID3v24Frames.FRAME_ID_TRACK, Id3FieldType.TEXT),
  TRACK_TOTAL(ID3v24Frames.FRAME_ID_TRACK, Id3FieldType.TEXT),
  URL_DISCOGS_ARTIST_SITE(ID3v24Frames.FRAME_ID_USER_DEFINED_URL, FrameBodyWXXX.URL_DISCOGS_ARTIST_SITE, Id3FieldType.TEXT),
  URL_DISCOGS_RELEASE_SITE(ID3v24Frames.FRAME_ID_USER_DEFINED_URL, FrameBodyWXXX.URL_DISCOGS_RELEASE_SITE, Id3FieldType.TEXT),
  URL_LYRICS_SITE(ID3v24Frames.FRAME_ID_USER_DEFINED_URL, FrameBodyWXXX.URL_LYRICS_SITE, Id3FieldType.TEXT),
  URL_OFFICIAL_ARTIST_SITE(ID3v24Frames.FRAME_ID_URL_ARTIST_WEB, Id3FieldType.TEXT),
  URL_OFFICIAL_RELEASE_SITE(ID3v24Frames.FRAME_ID_USER_DEFINED_URL, FrameBodyWXXX.URL_OFFICIAL_RELEASE_SITE, Id3FieldType.TEXT),
  URL_WIKIPEDIA_ARTIST_SITE(ID3v24Frames.FRAME_ID_USER_DEFINED_URL, FrameBodyWXXX.URL_WIKIPEDIA_ARTIST_SITE, Id3FieldType.TEXT),
  URL_WIKIPEDIA_RELEASE_SITE(ID3v24Frames.FRAME_ID_USER_DEFINED_URL, FrameBodyWXXX.URL_WIKIPEDIA_RELEASE_SITE, Id3FieldType.TEXT),
  WORK(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.WORK, Id3FieldType.TEXT),
  WORK_COMPOSITION(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION, Id3FieldType.TEXT),
  WORK_PARTOF_LEVEL3_TYPE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, Id3FieldType.TEXT),
  WORK_PART_LEVEL1(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1, Id3FieldType.TEXT),
  WORK_PART_LEVEL1_TYPE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, Id3FieldType.TEXT),
  WORK_PART_LEVEL2(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2, Id3FieldType.TEXT),
  WORK_PART_LEVEL2_TYPE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, Id3FieldType.TEXT),
  WORK_PART_LEVEL3(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3, Id3FieldType.TEXT),
  WORK_PART_LEVEL4(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4, Id3FieldType.TEXT),
  WORK_PART_LEVEL4_TYPE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, Id3FieldType.TEXT),
  WORK_PART_LEVEL5(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5, Id3FieldType.TEXT),
  WORK_PART_LEVEL5_TYPE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, Id3FieldType.TEXT),
  WORK_PART_LEVEL6(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6, Id3FieldType.TEXT),
  WORK_PART_LEVEL6_TYPE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, Id3FieldType.TEXT),
  WORK_TYPE(ID3v24Frames.FRAME_ID_USER_DEFINED_INFO, FrameBodyTXXX.WORK_TYPE, Id3FieldType.TEXT),
  YEAR(ID3v24Frames.FRAME_ID_YEAR, Id3FieldType.TEXT),
  ;

  private String fieldName;

  private String frameId;
  private String subId;
  private Id3FieldType fieldType;

  /**
   * For usual metadata fields that use a data field
   *
   * @param frameId   the frame that will be used
   * @param fieldType of data atom
   */
  ID3v24FieldKey(String frameId, Id3FieldType fieldType) {
    this.frameId = frameId;
    this.fieldType = fieldType;
    this.fieldName = frameId;
  }

  /**
   * @param frameId   the frame that will be used
   * @param subId     the additional key required within the frame to uniquely identify this key
   */
  ID3v24FieldKey(String frameId, String subId, Id3FieldType fieldType) {
    this.frameId = frameId;
    this.subId = subId;
    this.fieldType = fieldType;
    this.fieldName = BuilderHolder.makeFieldName(frameId, subId);
  }

  /**
   * @return fieldtype
   */
  public Id3FieldType getFieldType() {
    return fieldType;
  }

  /**
   * This is the frame identifier used to write the field
   *
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * This is the subfield used within the frame for this type of field
   *
   * @return subId
   */
  public String getSubId() {
    return subId;
  }

  /**
   * This is the value of the key that can uniquely identifer a key type
   *
   */
  public String getFieldName() {
    return fieldName;
  }

  private static class BuilderHolder {
    private static int MAX_LENGTH = 48;
    private static StringBuilder builder = new StringBuilder(MAX_LENGTH);

    @SuppressWarnings("Duplicates")
    private static String makeFieldName(@NotNull final String frameId, @NotNull final String subId) {
      builder.setLength(0);
      builder.append(frameId)
             .append(':')
             .append(subId);
      System.err.println(builder.length());
      Preconditions.checkState(builder.length() <= MAX_LENGTH);
      return builder.toString();
    }
  }

}
