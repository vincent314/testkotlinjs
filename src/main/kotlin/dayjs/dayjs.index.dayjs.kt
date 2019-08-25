@file:JsModule("dayjs")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package dayjs

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface `T$1` {
    var locale: String? get() = definedExternally; set(value) = definedExternally
    var format: String? get() = definedExternally; set(value) = definedExternally
    var utc: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$0` {
    var name: String
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}
external open class Dayjs {
    constructor(config: String)
    constructor(config: Number)
    constructor(config: Date)
    constructor(config: Dayjs)
    open fun clone(): Dayjs
    open fun isValid(): Boolean
    open fun year(): Number
    open fun year(value: Number): Dayjs
    open fun month(): Number
    open fun month(value: Number): Dayjs
    open fun date(): Number
    open fun date(value: Number): Dayjs
    open fun day(): Number
    open fun day(value: Number): Dayjs
    open fun hour(): Number
    open fun hour(value: Number): Dayjs
    open fun minute(): Number
    open fun minute(value: Number): Dayjs
    open fun second(): Number
    open fun second(value: Number): Dayjs
    open fun millisecond(): Number
    open fun millisecond(value: Number): Dayjs
    open fun set(unit: String /* 'millisecond' */, value: Number): Dayjs
    open fun set(unit: String /* 'second' */, value: Number): Dayjs
    open fun set(unit: String /* 'minute' */, value: Number): Dayjs
    open fun set(unit: String /* 'hour' */, value: Number): Dayjs
    open fun set(unit: String /* 'day' */, value: Number): Dayjs
    open fun set(unit: String /* 'month' */, value: Number): Dayjs
    open fun set(unit: String /* 'year' */, value: Number): Dayjs
    open fun set(unit: String /* 'date' */, value: Number): Dayjs
    open fun set(unit: String /* 'd' */, value: Number): Dayjs
    open fun set(unit: String /* 'M' */, value: Number): Dayjs
    open fun set(unit: String /* 'y' */, value: Number): Dayjs
    open fun set(unit: String /* 'h' */, value: Number): Dayjs
    open fun set(unit: String /* 'm' */, value: Number): Dayjs
    open fun set(unit: String /* 's' */, value: Number): Dayjs
    open fun set(unit: String /* 'ms' */, value: Number): Dayjs
    open fun get(unit: String /* 'millisecond' */): Number
    open fun get(unit: String /* 'second' */): Number
    open fun get(unit: String /* 'minute' */): Number
    open fun get(unit: String /* 'hour' */): Number
    open fun get(unit: String /* 'day' */): Number
    open fun get(unit: String /* 'month' */): Number
    open fun get(unit: String /* 'year' */): Number
    open fun get(unit: String /* 'date' */): Number
    open fun get(unit: String /* 'd' */): Number
    open fun get(unit: String /* 'M' */): Number
    open fun get(unit: String /* 'y' */): Number
    open fun get(unit: String /* 'h' */): Number
    open fun get(unit: String /* 'm' */): Number
    open fun get(unit: String /* 's' */): Number
    open fun get(unit: String /* 'ms' */): Number
    open fun add(value: Number, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */): Dayjs
    open fun subtract(value: Number, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */): Dayjs
    open fun startOf(unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */): Dayjs
    open fun endOf(unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */): Dayjs
    open fun format(template: String? = definedExternally /* null */): String
    open fun diff(date: String, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "quarter" | 'Q' | "week" | 'w' */ = definedExternally /* null */, float: Boolean? = definedExternally /* null */): Number
    open fun diff(date: Number, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "quarter" | 'Q' | "week" | 'w' */ = definedExternally /* null */, float: Boolean? = definedExternally /* null */): Number
    open fun diff(date: Date, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "quarter" | 'Q' | "week" | 'w' */ = definedExternally /* null */, float: Boolean? = definedExternally /* null */): Number
    open fun diff(date: Dayjs, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "quarter" | 'Q' | "week" | 'w' */ = definedExternally /* null */, float: Boolean? = definedExternally /* null */): Number
    open fun valueOf(): Number
    open fun unix(): Number
    open fun daysInMonth(): Number
    open fun toDate(): Date
    open fun toJSON(): String
    open fun toISOString(): String
    override fun toString(): String
    open fun utcOffset(): Number
    open fun isBefore(date: String, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */ = definedExternally /* null */): Boolean
    open fun isBefore(date: Number, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */ = definedExternally /* null */): Boolean
    open fun isBefore(date: Date, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */ = definedExternally /* null */): Boolean
    open fun isBefore(date: Dayjs, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */ = definedExternally /* null */): Boolean
    open fun isSame(date: String, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */ = definedExternally /* null */): Boolean
    open fun isSame(date: Number, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */ = definedExternally /* null */): Boolean
    open fun isSame(date: Date, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */ = definedExternally /* null */): Boolean
    open fun isSame(date: Dayjs, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */ = definedExternally /* null */): Boolean
    open fun isAfter(date: String, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */ = definedExternally /* null */): Boolean
    open fun isAfter(date: Number, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */ = definedExternally /* null */): Boolean
    open fun isAfter(date: Date, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */ = definedExternally /* null */): Boolean
    open fun isAfter(date: Dayjs, unit: dynamic /* 'millisecond' | 'second' | 'minute' | 'hour' | 'day' | 'month' | 'year' | 'date' | 'd' | 'M' | 'y' | 'h' | 'm' | 's' | 'ms' | "week" | 'w' */ = definedExternally /* null */): Boolean
    open fun locale(): String
    open fun locale(preset: String, `object`: Json? = definedExternally /* null */): Dayjs
    open fun locale(preset: `T$0`, `object`: Json? = definedExternally /* null */): Dayjs
}
external fun extend(plugin: PluginFunc, option: Any? = definedExternally /* null */): Dayjs
external fun locale(preset: String, `object`: Json? = definedExternally /* null */, isLocal: Boolean? = definedExternally /* null */): String
external fun locale(preset: `T$0`, `object`: Json? = definedExternally /* null */, isLocal: Boolean? = definedExternally /* null */): String
external fun isDayjs(d: Any): Boolean
external fun unix(t: Number): Dayjs
external object Ls {
    @nativeGetter
    operator fun get(key: String): Json?
    @nativeSetter
    operator fun set(key: String, value: Json)
}