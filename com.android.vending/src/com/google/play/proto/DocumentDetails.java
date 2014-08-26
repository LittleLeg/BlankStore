// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Documents.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DocumentDetails extends Message {

  @ProtoField(tag = 1)
  public final AppDetails appDetails;

  @ProtoField(tag = 2)
  public final AlbumDetails albumDetails;

  @ProtoField(tag = 3)
  public final ArtistDetails artistDetails;

  @ProtoField(tag = 4)
  public final SongDetails songDetails;

  @ProtoField(tag = 5)
  public final BookDetails bookDetails;

  @ProtoField(tag = 6)
  public final VideoDetails videoDetails;

  @ProtoField(tag = 7)
  public final SubscriptionDetails subscriptionDetails;

  @ProtoField(tag = 8)
  public final MagazineDetails magazineDetails;

  @ProtoField(tag = 9)
  public final TvShowDetails tvShowDetails;

  @ProtoField(tag = 10)
  public final TvSeasonDetails tvSeasonDetails;

  @ProtoField(tag = 11)
  public final TvEpisodeDetails tvEpisodeDetails;

  public DocumentDetails(AppDetails appDetails, AlbumDetails albumDetails, ArtistDetails artistDetails, SongDetails songDetails, BookDetails bookDetails, VideoDetails videoDetails, SubscriptionDetails subscriptionDetails, MagazineDetails magazineDetails, TvShowDetails tvShowDetails, TvSeasonDetails tvSeasonDetails, TvEpisodeDetails tvEpisodeDetails) {
    this.appDetails = appDetails;
    this.albumDetails = albumDetails;
    this.artistDetails = artistDetails;
    this.songDetails = songDetails;
    this.bookDetails = bookDetails;
    this.videoDetails = videoDetails;
    this.subscriptionDetails = subscriptionDetails;
    this.magazineDetails = magazineDetails;
    this.tvShowDetails = tvShowDetails;
    this.tvSeasonDetails = tvSeasonDetails;
    this.tvEpisodeDetails = tvEpisodeDetails;
  }

  private DocumentDetails(Builder builder) {
    this(builder.appDetails, builder.albumDetails, builder.artistDetails, builder.songDetails, builder.bookDetails, builder.videoDetails, builder.subscriptionDetails, builder.magazineDetails, builder.tvShowDetails, builder.tvSeasonDetails, builder.tvEpisodeDetails);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DocumentDetails)) return false;
    DocumentDetails o = (DocumentDetails) other;
    return equals(appDetails, o.appDetails)
        && equals(albumDetails, o.albumDetails)
        && equals(artistDetails, o.artistDetails)
        && equals(songDetails, o.songDetails)
        && equals(bookDetails, o.bookDetails)
        && equals(videoDetails, o.videoDetails)
        && equals(subscriptionDetails, o.subscriptionDetails)
        && equals(magazineDetails, o.magazineDetails)
        && equals(tvShowDetails, o.tvShowDetails)
        && equals(tvSeasonDetails, o.tvSeasonDetails)
        && equals(tvEpisodeDetails, o.tvEpisodeDetails);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = appDetails != null ? appDetails.hashCode() : 0;
      result = result * 37 + (albumDetails != null ? albumDetails.hashCode() : 0);
      result = result * 37 + (artistDetails != null ? artistDetails.hashCode() : 0);
      result = result * 37 + (songDetails != null ? songDetails.hashCode() : 0);
      result = result * 37 + (bookDetails != null ? bookDetails.hashCode() : 0);
      result = result * 37 + (videoDetails != null ? videoDetails.hashCode() : 0);
      result = result * 37 + (subscriptionDetails != null ? subscriptionDetails.hashCode() : 0);
      result = result * 37 + (magazineDetails != null ? magazineDetails.hashCode() : 0);
      result = result * 37 + (tvShowDetails != null ? tvShowDetails.hashCode() : 0);
      result = result * 37 + (tvSeasonDetails != null ? tvSeasonDetails.hashCode() : 0);
      result = result * 37 + (tvEpisodeDetails != null ? tvEpisodeDetails.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<DocumentDetails> {

    public AppDetails appDetails;
    public AlbumDetails albumDetails;
    public ArtistDetails artistDetails;
    public SongDetails songDetails;
    public BookDetails bookDetails;
    public VideoDetails videoDetails;
    public SubscriptionDetails subscriptionDetails;
    public MagazineDetails magazineDetails;
    public TvShowDetails tvShowDetails;
    public TvSeasonDetails tvSeasonDetails;
    public TvEpisodeDetails tvEpisodeDetails;

    public Builder() {
    }

    public Builder(DocumentDetails message) {
      super(message);
      if (message == null) return;
      this.appDetails = message.appDetails;
      this.albumDetails = message.albumDetails;
      this.artistDetails = message.artistDetails;
      this.songDetails = message.songDetails;
      this.bookDetails = message.bookDetails;
      this.videoDetails = message.videoDetails;
      this.subscriptionDetails = message.subscriptionDetails;
      this.magazineDetails = message.magazineDetails;
      this.tvShowDetails = message.tvShowDetails;
      this.tvSeasonDetails = message.tvSeasonDetails;
      this.tvEpisodeDetails = message.tvEpisodeDetails;
    }

    public Builder appDetails(AppDetails appDetails) {
      this.appDetails = appDetails;
      return this;
    }

    public Builder albumDetails(AlbumDetails albumDetails) {
      this.albumDetails = albumDetails;
      return this;
    }

    public Builder artistDetails(ArtistDetails artistDetails) {
      this.artistDetails = artistDetails;
      return this;
    }

    public Builder songDetails(SongDetails songDetails) {
      this.songDetails = songDetails;
      return this;
    }

    public Builder bookDetails(BookDetails bookDetails) {
      this.bookDetails = bookDetails;
      return this;
    }

    public Builder videoDetails(VideoDetails videoDetails) {
      this.videoDetails = videoDetails;
      return this;
    }

    public Builder subscriptionDetails(SubscriptionDetails subscriptionDetails) {
      this.subscriptionDetails = subscriptionDetails;
      return this;
    }

    public Builder magazineDetails(MagazineDetails magazineDetails) {
      this.magazineDetails = magazineDetails;
      return this;
    }

    public Builder tvShowDetails(TvShowDetails tvShowDetails) {
      this.tvShowDetails = tvShowDetails;
      return this;
    }

    public Builder tvSeasonDetails(TvSeasonDetails tvSeasonDetails) {
      this.tvSeasonDetails = tvSeasonDetails;
      return this;
    }

    public Builder tvEpisodeDetails(TvEpisodeDetails tvEpisodeDetails) {
      this.tvEpisodeDetails = tvEpisodeDetails;
      return this;
    }

    @Override
    public DocumentDetails build() {
      return new DocumentDetails(this);
    }
  }
}