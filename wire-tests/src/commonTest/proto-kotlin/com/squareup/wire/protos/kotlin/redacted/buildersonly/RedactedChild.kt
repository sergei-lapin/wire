// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.redacted_test.RedactedChild in redacted_test_builders_only.proto
package com.squareup.wire.protos.kotlin.redacted.buildersonly

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmSynthetic
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import okio.ByteString

public class RedactedChild private constructor(
  builder: Builder,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<RedactedChild, RedactedChild.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 0,
  )
  @JvmField
  public val a: String? = builder.a

  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.protos.kotlin.redacted.buildersonly.RedactedFields#ADAPTER",
    schemaIndex = 1,
  )
  @JvmField
  public val b: RedactedFields? = builder.b

  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.protos.kotlin.redacted.buildersonly.NotRedacted#ADAPTER",
    schemaIndex = 2,
  )
  @JvmField
  public val c: NotRedacted? = builder.c

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.a = a
    builder.b = b
    builder.c = c
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is RedactedChild) return false
    if (unknownFields != other.unknownFields) return false
    if (a != other.a) return false
    if (b != other.b) return false
    if (c != other.c) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (a?.hashCode() ?: 0)
      result = result * 37 + (b?.hashCode() ?: 0)
      result = result * 37 + (c?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (a != null) result += """a=${sanitize(a)}"""
    if (b != null) result += """b=$b"""
    if (c != null) result += """c=$c"""
    return result.joinToString(prefix = "RedactedChild{", separator = ", ", postfix = "}")
  }

  public class Builder : Message.Builder<RedactedChild, Builder>() {
    @JvmField
    public var a: String? = null

    @JvmField
    public var b: RedactedFields? = null

    @JvmField
    public var c: NotRedacted? = null

    public fun a(a: String?): Builder {
      this.a = a
      return this
    }

    public fun b(b: RedactedFields?): Builder {
      this.b = b
      return this
    }

    public fun c(c: NotRedacted?): Builder {
      this.c = c
      return this
    }

    override fun build(): RedactedChild = RedactedChild(
      builder = this,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<RedactedChild> = object : ProtoAdapter<RedactedChild>(
      FieldEncoding.LENGTH_DELIMITED, 
      RedactedChild::class, 
      "type.googleapis.com/squareup.protos.kotlin.redacted_test.RedactedChild", 
      PROTO_2, 
      null, 
      "redacted_test_builders_only.proto"
    ) {
      override fun encodedSize(`value`: RedactedChild): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.a)
        size += RedactedFields.ADAPTER.encodedSizeWithTag(2, value.b)
        size += NotRedacted.ADAPTER.encodedSizeWithTag(3, value.c)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: RedactedChild) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.a)
        RedactedFields.ADAPTER.encodeWithTag(writer, 2, value.b)
        NotRedacted.ADAPTER.encodeWithTag(writer, 3, value.c)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: RedactedChild) {
        writer.writeBytes(value.unknownFields)
        NotRedacted.ADAPTER.encodeWithTag(writer, 3, value.c)
        RedactedFields.ADAPTER.encodeWithTag(writer, 2, value.b)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.a)
      }

      override fun decode(reader: ProtoReader): RedactedChild {
        val builder = Builder()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> builder.a(ProtoAdapter.STRING.decode(reader))
            2 -> builder.b(RedactedFields.ADAPTER.decode(reader))
            3 -> builder.c(NotRedacted.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return RedactedChild(
          builder = builder,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: RedactedChild): RedactedChild = RedactedChild(
        builder = value.newBuilder()
          .b(value.b?.let(RedactedFields.ADAPTER::redact))
          .c(value.c?.let(NotRedacted.ADAPTER::redact)),
        unknownFields = ByteString.EMPTY,
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): RedactedChild = Builder().apply(body).build()
  }
}
