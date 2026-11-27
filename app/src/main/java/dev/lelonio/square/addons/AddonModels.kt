package dev.lelonio.square.addons

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

/** Official BitChord addon protocol wire models. */
@Serializable
data class AddonManifest(
    @SerialName("id") val id: String = "",
    @SerialName("name") val name: String = "",
    @SerialName("version") val version: String = "",
    @SerialName("resources") val resources: List<String> = emptyList(),
    @SerialName("settings") val settings: List<AddonSetting> = emptyList(),
    @SerialName("allowDownloads") val allowDownloads: JsonElement? = null,
    @SerialName("checkValidLossless") val checkValidLossless: JsonElement? = null,
    @SerialName("bitchordAuth") val bitchordAuth: JsonElement? = null,
)

@Serializable
data class AddonSetting(
    @SerialName("key") val key: String = "",
    @SerialName("default") val default: JsonElement? = null,
    @SerialName("options") val options: List<AddonSettingOption> = emptyList(),
)

@Serializable
data class AddonSettingOption(
    @SerialName("value") val value: JsonElement? = null,
    @SerialName("label") val label: JsonElement? = null,
)

@Serializable
data class AddonSearchResult(
    @SerialName("tracks") val tracks: List<AddonTrack> = emptyList(),
)

@Serializable
data class AddonTrack(
    @SerialName("id") val id: String = "",
    @SerialName("title") val title: String = "",
    @SerialName("artist") val artist: String = "",
    @SerialName("album") val album: String = "",
    @SerialName("duration") val duration: Double? = null,
    @SerialName("artworkURL") val artworkURL: String? = null,
    @SerialName("albumArtworkURL") val albumArtworkURL: String? = null,
    @SerialName("format") val format: String = "",
    @SerialName("audioQuality") val audioQuality: String = "",
    @SerialName("streamURL") val streamURL: String? = null,
)

@Serializable
data class AddonStream(
    @SerialName("url") val url: String = "",
    @SerialName("manifest") val manifest: String? = null,
    @SerialName("format") val format: String = "",
    @SerialName("codec") val codec: String? = null,
    @SerialName("container") val container: String? = null,
    @SerialName("mimeType") val mimeType: String? = null,
    @SerialName("encrypted") val encrypted: JsonElement? = null,
    @SerialName("sampleRate") val sampleRate: Double? = null,
    @SerialName("bitDepth") val bitDepth: Double? = null,
    @SerialName("bitrate") val bitrate: Double? = null,
    @SerialName("error") val error: String? = null,
)
