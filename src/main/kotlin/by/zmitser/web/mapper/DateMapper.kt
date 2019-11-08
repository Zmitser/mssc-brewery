package by.zmitser.web.mapper

import java.sql.Timestamp
import java.sql.Timestamp.valueOf
import java.time.OffsetDateTime
import java.time.OffsetDateTime.of
import java.time.ZoneOffset
import javax.inject.Singleton


@Singleton
class DateMapper {

    fun asOffsetDateTime(ts: Timestamp?): OffsetDateTime? {
        return if (ts != null) {
            of(ts.toLocalDateTime().year, ts.toLocalDateTime().monthValue,
                    ts.toLocalDateTime().dayOfMonth, ts.toLocalDateTime().hour, ts.toLocalDateTime().minute,
                    ts.toLocalDateTime().second, ts.toLocalDateTime().nano, ZoneOffset.UTC)
        } else {
            null
        }
    }

    fun asTimestamp(offsetDateTime: OffsetDateTime?): Timestamp? {
        return if (offsetDateTime != null) {
            valueOf(offsetDateTime.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime())
        } else {
            null
        }
    }
}