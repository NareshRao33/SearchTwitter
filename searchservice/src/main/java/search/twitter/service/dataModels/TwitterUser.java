package search.twitter.service.dataModels;

import com.google.gson.annotations.SerializedName;


public class TwitterUser {


	private String name;
	@SerializedName("screen_name")

	private String screenName;
	@SerializedName("location")

	private String location;
	@SerializedName("description")

	private String description;
	@SerializedName("url")

	private Object url;

	@SerializedName("protected")
	private Boolean _protected;
	@SerializedName("followers_count")

	private Integer followersCount;
	@SerializedName("friends_count")

	private Integer friendsCount;
	@SerializedName("listed_count")

	private Integer listedCount;
	@SerializedName("created_at")

	private String createdAt;
	@SerializedName("favourites_count")

	private Integer favouritesCount;
	@SerializedName("utc_offset")

	private Integer utcOffset;
	@SerializedName("time_zone")

	private String timeZone;
	@SerializedName("geo_enabled")

	private Boolean geoEnabled;
	@SerializedName("verified")

	private Boolean verified;
	@SerializedName("statuses_count")

	private Integer statusesCount;
	@SerializedName("lang")

	private String lang;
	@SerializedName("contributors_enabled")

	private Boolean contributorsEnabled;
	@SerializedName("is_translator")

	private Boolean isTranslator;
	@SerializedName("is_translation_enabled")

	private Boolean isTranslationEnabled;
	@SerializedName("profile_background_color")

	private String profileBackgroundColor;
	@SerializedName("profile_background_image_url")

	private String profileBackgroundImageUrl;
	@SerializedName("profile_background_image_url_https")

	private String profileBackgroundImageUrlHttps;
	@SerializedName("profile_background_tile")

	private Boolean profileBackgroundTile;
	@SerializedName("profile_image_url")

	private String profileImageUrl;
	@SerializedName("profile_image_url_https")

	private String profileImageUrlHttps;
	@SerializedName("profile_banner_url")

	private String profileBannerUrl;
	@SerializedName("profile_link_color")

	private String profileLinkColor;
	@SerializedName("profile_sidebar_border_color")

	private String profileSidebarBorderColor;
	@SerializedName("profile_sidebar_fill_color")

	private String profileSidebarFillColor;
	@SerializedName("profile_text_color")

	private String profileTextColor;
	@SerializedName("profile_use_background_image")

	private Boolean profileUseBackgroundImage;
	@SerializedName("has_extended_profile")

	private Boolean hasExtendedProfile;
	@SerializedName("default_profile")

	private Boolean defaultProfile;
	@SerializedName("default_profile_image")

	private Boolean defaultProfileImage;
	@SerializedName("following")

	private Object following;
	@SerializedName("follow_request_sent")

	private Object followRequestSent;
	@SerializedName("notifications")

	private Object notifications;

	/**
	 *
	 * @return
	 *     The name
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @param name
	 *     The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *
	 * @return
	 *     The screenName
	 */
	public String getScreenName() {
		return screenName;
	}

	/**
	 *
	 * @param screenName
	 *     The screen_name
	 */
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	/**
	 *
	 * @return
	 *     The location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 *
	 * @param location
	 *     The location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 *
	 * @return
	 *     The description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 *
	 * @param description
	 *     The description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 *
	 * @return
	 *     The url
	 */
	public Object getUrl() {
		return url;
	}

	/**
	 *
	 * @param url
	 *     The url
	 */
	public void setUrl(Object url) {
		this.url = url;
	}


	/**
	 *
	 * @return
	 *     The followersCount
	 */
	public Integer getFollowersCount() {
		return followersCount;
	}

	/**
	 *
	 * @param followersCount
	 *     The followers_count
	 */
	public void setFollowersCount(Integer followersCount) {
		this.followersCount = followersCount;
	}

	/**
	 *
	 * @return
	 *     The friendsCount
	 */
	public Integer getFriendsCount() {
		return friendsCount;
	}

	/**
	 *
	 * @param friendsCount
	 *     The friends_count
	 */
	public void setFriendsCount(Integer friendsCount) {
		this.friendsCount = friendsCount;
	}

	/**
	 *
	 * @return
	 *     The listedCount
	 */
	public Integer getListedCount() {
		return listedCount;
	}

	/**
	 *
	 * @param listedCount
	 *     The listed_count
	 */
	public void setListedCount(Integer listedCount) {
		this.listedCount = listedCount;
	}

	/**
	 *
	 * @return
	 *     The createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 *
	 * @param createdAt
	 *     The created_at
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 *
	 * @return
	 *     The favouritesCount
	 */
	public Integer getFavouritesCount() {
		return favouritesCount;
	}

	/**
	 *
	 * @param favouritesCount
	 *     The favourites_count
	 */
	public void setFavouritesCount(Integer favouritesCount) {
		this.favouritesCount = favouritesCount;
	}

	/**
	 *
	 * @return
	 *     The utcOffset
	 */
	public Integer getUtcOffset() {
		return utcOffset;
	}

	/**
	 *
	 * @param utcOffset
	 *     The utc_offset
	 */
	public void setUtcOffset(Integer utcOffset) {
		this.utcOffset = utcOffset;
	}

	/**
	 *
	 * @return
	 *     The timeZone
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 *
	 * @param timeZone
	 *     The time_zone
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 *
	 * @return
	 *     The geoEnabled
	 */
	public Boolean getGeoEnabled() {
		return geoEnabled;
	}

	/**
	 *
	 * @param geoEnabled
	 *     The geo_enabled
	 */
	public void setGeoEnabled(Boolean geoEnabled) {
		this.geoEnabled = geoEnabled;
	}

	/**
	 *
	 * @return
	 *     The verified
	 */
	public Boolean getVerified() {
		return verified;
	}

	/**
	 *
	 * @param verified
	 *     The verified
	 */
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	/**
	 *
	 * @return
	 *     The statusesCount
	 */
	public Integer getStatusesCount() {
		return statusesCount;
	}

	/**
	 *
	 * @param statusesCount
	 *     The statuses_count
	 */
	public void setStatusesCount(Integer statusesCount) {
		this.statusesCount = statusesCount;
	}

	/**
	 *
	 * @return
	 *     The lang
	 */
	public String getLang() {
		return lang;
	}

	/**
	 *
	 * @param lang
	 *     The lang
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}

	/**
	 *
	 * @return
	 *     The contributorsEnabled
	 */
	public Boolean getContributorsEnabled() {
		return contributorsEnabled;
	}

	/**
	 *
	 * @param contributorsEnabled
	 *     The contributors_enabled
	 */
	public void setContributorsEnabled(Boolean contributorsEnabled) {
		this.contributorsEnabled = contributorsEnabled;
	}

	/**
	 *
	 * @return
	 *     The isTranslator
	 */
	public Boolean getIsTranslator() {
		return isTranslator;
	}

	/**
	 *
	 * @param isTranslator
	 *     The is_translator
	 */
	public void setIsTranslator(Boolean isTranslator) {
		this.isTranslator = isTranslator;
	}

	/**
	 *
	 * @return
	 *     The isTranslationEnabled
	 */
	public Boolean getIsTranslationEnabled() {
		return isTranslationEnabled;
	}

	/**
	 *
	 * @param isTranslationEnabled
	 *     The is_translation_enabled
	 */
	public void setIsTranslationEnabled(Boolean isTranslationEnabled) {
		this.isTranslationEnabled = isTranslationEnabled;
	}

	/**
	 *
	 * @return
	 *     The profileBackgroundColor
	 */
	public String getProfileBackgroundColor() {
		return profileBackgroundColor;
	}

	/**
	 *
	 * @param profileBackgroundColor
	 *     The profile_background_color
	 */
	public void setProfileBackgroundColor(String profileBackgroundColor) {
		this.profileBackgroundColor = profileBackgroundColor;
	}

	/**
	 *
	 * @return
	 *     The profileBackgroundImageUrl
	 */
	public String getProfileBackgroundImageUrl() {
		return profileBackgroundImageUrl;
	}

	/**
	 *
	 * @param profileBackgroundImageUrl
	 *     The profile_background_image_url
	 */
	public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
		this.profileBackgroundImageUrl = profileBackgroundImageUrl;
	}

	/**
	 *
	 * @return
	 *     The profileBackgroundImageUrlHttps
	 */
	public String getProfileBackgroundImageUrlHttps() {
		return profileBackgroundImageUrlHttps;
	}

	/**
	 *
	 * @param profileBackgroundImageUrlHttps
	 *     The profile_background_image_url_https
	 */
	public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
		this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
	}

	/**
	 *
	 * @return
	 *     The profileBackgroundTile
	 */
	public Boolean getProfileBackgroundTile() {
		return profileBackgroundTile;
	}

	/**
	 *
	 * @param profileBackgroundTile
	 *     The profile_background_tile
	 */
	public void setProfileBackgroundTile(Boolean profileBackgroundTile) {
		this.profileBackgroundTile = profileBackgroundTile;
	}

	/**
	 *
	 * @return
	 *     The profileImageUrl
	 */
	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	/**
	 *
	 * @param profileImageUrl
	 *     The profile_image_url
	 */
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	/**
	 *
	 * @return
	 *     The profileImageUrlHttps
	 */
	public String getProfileImageUrlHttps() {
		return profileImageUrlHttps;
	}

	/**
	 *
	 * @param profileImageUrlHttps
	 *     The profile_image_url_https
	 */
	public void setProfileImageUrlHttps(String profileImageUrlHttps) {
		this.profileImageUrlHttps = profileImageUrlHttps;
	}

	/**
	 *
	 * @return
	 *     The profileBannerUrl
	 */
	public String getProfileBannerUrl() {
		return profileBannerUrl;
	}

	/**
	 *
	 * @param profileBannerUrl
	 *     The profile_banner_url
	 */
	public void setProfileBannerUrl(String profileBannerUrl) {
		this.profileBannerUrl = profileBannerUrl;
	}

	/**
	 *
	 * @return
	 *     The profileLinkColor
	 */
	public String getProfileLinkColor() {
		return profileLinkColor;
	}

	/**
	 *
	 * @param profileLinkColor
	 *     The profile_link_color
	 */
	public void setProfileLinkColor(String profileLinkColor) {
		this.profileLinkColor = profileLinkColor;
	}

	/**
	 *
	 * @return
	 *     The profileSidebarBorderColor
	 */
	public String getProfileSidebarBorderColor() {
		return profileSidebarBorderColor;
	}

	/**
	 *
	 * @param profileSidebarBorderColor
	 *     The profile_sidebar_border_color
	 */
	public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
		this.profileSidebarBorderColor = profileSidebarBorderColor;
	}

	/**
	 *
	 * @return
	 *     The profileSidebarFillColor
	 */
	public String getProfileSidebarFillColor() {
		return profileSidebarFillColor;
	}

	/**
	 *
	 * @param profileSidebarFillColor
	 *     The profile_sidebar_fill_color
	 */
	public void setProfileSidebarFillColor(String profileSidebarFillColor) {
		this.profileSidebarFillColor = profileSidebarFillColor;
	}

	/**
	 *
	 * @return
	 *     The profileTextColor
	 */
	public String getProfileTextColor() {
		return profileTextColor;
	}

	/**
	 *
	 * @param profileTextColor
	 *     The profile_text_color
	 */
	public void setProfileTextColor(String profileTextColor) {
		this.profileTextColor = profileTextColor;
	}

	/**
	 *
	 * @return
	 *     The profileUseBackgroundImage
	 */
	public Boolean getProfileUseBackgroundImage() {
		return profileUseBackgroundImage;
	}

	/**
	 *
	 * @param profileUseBackgroundImage
	 *     The profile_use_background_image
	 */
	public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
		this.profileUseBackgroundImage = profileUseBackgroundImage;
	}

	/**
	 *
	 * @return
	 *     The hasExtendedProfile
	 */
	public Boolean getHasExtendedProfile() {
		return hasExtendedProfile;
	}

	/**
	 *
	 * @param hasExtendedProfile
	 *     The has_extended_profile
	 */
	public void setHasExtendedProfile(Boolean hasExtendedProfile) {
		this.hasExtendedProfile = hasExtendedProfile;
	}

	/**
	 *
	 * @return
	 *     The defaultProfile
	 */
	public Boolean getDefaultProfile() {
		return defaultProfile;
	}

	/**
	 *
	 * @param defaultProfile
	 *     The default_profile
	 */
	public void setDefaultProfile(Boolean defaultProfile) {
		this.defaultProfile = defaultProfile;
	}

	/**
	 *
	 * @return
	 *     The defaultProfileImage
	 */
	public Boolean getDefaultProfileImage() {
		return defaultProfileImage;
	}

	/**
	 *
	 * @param defaultProfileImage
	 *     The default_profile_image
	 */
	public void setDefaultProfileImage(Boolean defaultProfileImage) {
		this.defaultProfileImage = defaultProfileImage;
	}

	/**
	 *
	 * @return
	 *     The following
	 */
	public Object getFollowing() {
		return following;
	}

	/**
	 *
	 * @param following
	 *     The following
	 */
	public void setFollowing(Object following) {
		this.following = following;
	}

	/**
	 *
	 * @return
	 *     The followRequestSent
	 */
	public Object getFollowRequestSent() {
		return followRequestSent;
	}

	/**
	 *
	 * @param followRequestSent
	 *     The follow_request_sent
	 */
	public void setFollowRequestSent(Object followRequestSent) {
		this.followRequestSent = followRequestSent;
	}

	/**
	 *
	 * @return
	 *     The notifications
	 */
	public Object getNotifications() {
		return notifications;
	}

	/**
	 *
	 * @param notifications
	 *     The notifications
	 */
	public void setNotifications(Object notifications) {
		this.notifications = notifications;
	}

}
