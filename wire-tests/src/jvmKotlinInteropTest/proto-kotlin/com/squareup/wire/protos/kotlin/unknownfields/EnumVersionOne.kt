// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.unknownfields.EnumVersionOne in unknown_fields.proto
package com.squareup.wire.protos.kotlin.unknownfields

import com.squareup.wire.EnumAdapter
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import kotlin.Int

public enum class EnumVersionOne(
  override val `value`: Int,
) : WireEnum {
  SHREK_V1(1),
  DONKEY_V1(2),
  FIONA_V1(3),
  ;

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<EnumVersionOne> = object : EnumAdapter<EnumVersionOne>(
      EnumVersionOne::class, 
      PROTO_2, 
      null
    ) {
      override fun fromValue(`value`: Int): EnumVersionOne? = EnumVersionOne.fromValue(value)
    }

    @JvmStatic
    public fun fromValue(`value`: Int): EnumVersionOne? = when (value) {
      1 -> SHREK_V1
      2 -> DONKEY_V1
      3 -> FIONA_V1
      else -> null
    }
  }
}
