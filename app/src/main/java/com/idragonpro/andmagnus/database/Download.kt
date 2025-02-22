package com.idragonpro.andmagnus.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "downloads_table")
data class Download(
    @ColumnInfo(name = "name") val name: String,

    @ColumnInfo(name = "ext") val ext: String,

    @ColumnInfo(name = "timestamp") val timestamp: Long,

    @ColumnInfo(name = "expiryDate") val expiryDate: Long,

    @ColumnInfo(name = "total_size") var totalSize: Long,

    @ColumnInfo(name = "videoId") var videoId: String,

    @ColumnInfo(name = "duration") var duration: Long,

    @ColumnInfo(name = "mobileNumber") var mobileNumber: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0

    @ColumnInfo(name = "downloaded_percent")
    var downloadedPercent: Double = 0.0

    @ColumnInfo(name = "downloaded_size")
    var downloadedSize: Long = 0L

    @ColumnInfo(name = "downloaded_path")
    lateinit var downloadedPath: String

    @ColumnInfo(name = "media_type")
    lateinit var mediaType: String

    @ColumnInfo(name = "thumbnail")
    lateinit var thumbnail: String

    @ColumnInfo(name = "url")
    lateinit var url: String
}