// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/google/protobuf/descriptor.proto at 458:1
package com.google.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.TagMap;
import com.squareup.wire.WireField;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.util.Collections;
import java.util.List;

/**
 * ===================================================================
 * Optional source code info
 * Encapsulates information about the original source file from which a
 * FileDescriptorProto was generated.
 */
public final class SourceCodeInfo extends Message<SourceCodeInfo> {
  public static final ProtoAdapter<SourceCodeInfo> ADAPTER = ProtoAdapter.newMessageAdapter(SourceCodeInfo.class);

  private static final long serialVersionUID = 0L;

  /**
   * A Location identifies a piece of source code in a .proto file which
   * corresponds to a particular definition.  This information is intended
   * to be useful to IDEs, code indexers, documentation generators, and similar
   * tools.
   *
   * For example, say we have a file like:
   *   message Foo {
   *     optional string foo = 1;
   *   }
   * Let's look at just the field definition:
   *   optional string foo = 1;
   *   ^       ^^     ^^  ^  ^^^
   *   a       bc     de  f  ghi
   * We have the following locations:
   *   span   path               represents
   *   [a,i)  [ 4, 0, 2, 0 ]     The whole field definition.
   *   [a,b)  [ 4, 0, 2, 0, 4 ]  The label (optional).
   *   [c,d)  [ 4, 0, 2, 0, 5 ]  The type (string).
   *   [e,f)  [ 4, 0, 2, 0, 1 ]  The name (foo).
   *   [g,h)  [ 4, 0, 2, 0, 3 ]  The number (1).
   *
   * Notes:
   * - A location may refer to a repeated field itself (i.e. not to any
   *   particular index within it).  This is used whenever a set of elements are
   *   logically enclosed in a single code segment.  For example, an entire
   *   extend block (possibly containing multiple extension definitions) will
   *   have an outer location whose path refers to the "extensions" repeated
   *   field without an index.
   * - Multiple locations may have the same path.  This happens when a single
   *   logical declaration is spread out across multiple places.  The most
   *   obvious example is the "extend" block again -- there may be multiple
   *   extend blocks in the same scope, each of which will have the same path.
   * - A location's span is not always a subset of its parent's span.  For
   *   example, the "extendee" of an extension declaration appears at the
   *   beginning of the "extend" block and is shared by all extensions within
   *   the block.
   * - Just because a location's span is a subset of some other location's span
   *   does not mean that it is a descendent.  For example, a "group" defines
   *   both a type and a field in a single declaration.  Thus, the locations
   *   corresponding to the type and field and their components will overlap.
   * - Code which tries to interpret locations should probably be designed to
   *   ignore those that it doesn't understand, as more types of locations could
   *   be recorded in the future.
   */
  @WireField(
      tag = 1,
      adapter = "com.google.protobuf.SourceCodeInfo$Location#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<Location> location;

  public SourceCodeInfo(List<Location> location) {
    this(location, TagMap.EMPTY);
  }

  public SourceCodeInfo(List<Location> location, TagMap tagMap) {
    super(tagMap);
    this.location = immutableCopyOf(location);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SourceCodeInfo)) return false;
    SourceCodeInfo o = (SourceCodeInfo) other;
    return equals(tagMap(), o.tagMap())
        && equals(location, o.location);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = tagMap().hashCode();
      result = result * 37 + (location != null ? location.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<SourceCodeInfo, Builder> {
    public List<Location> location;

    public Builder() {
      location = Collections.emptyList();
    }

    public Builder(SourceCodeInfo message) {
      super(message);
      if (message == null) return;
      this.location = copyOf(message.location);
    }

    /**
     * A Location identifies a piece of source code in a .proto file which
     * corresponds to a particular definition.  This information is intended
     * to be useful to IDEs, code indexers, documentation generators, and similar
     * tools.
     *
     * For example, say we have a file like:
     *   message Foo {
     *     optional string foo = 1;
     *   }
     * Let's look at just the field definition:
     *   optional string foo = 1;
     *   ^       ^^     ^^  ^  ^^^
     *   a       bc     de  f  ghi
     * We have the following locations:
     *   span   path               represents
     *   [a,i)  [ 4, 0, 2, 0 ]     The whole field definition.
     *   [a,b)  [ 4, 0, 2, 0, 4 ]  The label (optional).
     *   [c,d)  [ 4, 0, 2, 0, 5 ]  The type (string).
     *   [e,f)  [ 4, 0, 2, 0, 1 ]  The name (foo).
     *   [g,h)  [ 4, 0, 2, 0, 3 ]  The number (1).
     *
     * Notes:
     * - A location may refer to a repeated field itself (i.e. not to any
     *   particular index within it).  This is used whenever a set of elements are
     *   logically enclosed in a single code segment.  For example, an entire
     *   extend block (possibly containing multiple extension definitions) will
     *   have an outer location whose path refers to the "extensions" repeated
     *   field without an index.
     * - Multiple locations may have the same path.  This happens when a single
     *   logical declaration is spread out across multiple places.  The most
     *   obvious example is the "extend" block again -- there may be multiple
     *   extend blocks in the same scope, each of which will have the same path.
     * - A location's span is not always a subset of its parent's span.  For
     *   example, the "extendee" of an extension declaration appears at the
     *   beginning of the "extend" block and is shared by all extensions within
     *   the block.
     * - Just because a location's span is a subset of some other location's span
     *   does not mean that it is a descendent.  For example, a "group" defines
     *   both a type and a field in a single declaration.  Thus, the locations
     *   corresponding to the type and field and their components will overlap.
     * - Code which tries to interpret locations should probably be designed to
     *   ignore those that it doesn't understand, as more types of locations could
     *   be recorded in the future.
     */
    public Builder location(List<Location> location) {
      checkElementsNotNull(location);
      this.location = location;
      return this;
    }

    @Override
    public SourceCodeInfo build() {
      return new SourceCodeInfo(location, buildTagMap());
    }
  }

  public static final class Location extends Message<Location> {
    public static final ProtoAdapter<Location> ADAPTER = ProtoAdapter.newMessageAdapter(Location.class);

    private static final long serialVersionUID = 0L;

    /**
     * Identifies which part of the FileDescriptorProto was defined at this
     * location.
     *
     * Each element is a field number or an index.  They form a path from
     * the root FileDescriptorProto to the place where the definition.  For
     * example, this path:
     *   [ 4, 3, 2, 7, 1 ]
     * refers to:
     *   file.message_type(3)  // 4, 3
     *       .field(7)         // 2, 7
     *       .name()           // 1
     * This is because FileDescriptorProto.message_type has field number 4:
     *   repeated DescriptorProto message_type = 4;
     * and DescriptorProto.field has field number 2:
     *   repeated FieldDescriptorProto field = 2;
     * and FieldDescriptorProto.name has field number 1:
     *   optional string name = 1;
     *
     * Thus, the above path gives the location of a field name.  If we removed
     * the last element:
     *   [ 4, 3, 2, 7 ]
     * this path refers to the whole field declaration (from the beginning
     * of the label to the terminating semicolon).
     */
    @WireField(
        tag = 1,
        adapter = "com.squareup.wire.ProtoAdapter#INT32",
        label = WireField.Label.PACKED
    )
    public final List<Integer> path;

    /**
     * Always has exactly three or four elements: start line, start column,
     * end line (optional, otherwise assumed same as start line), end column.
     * These are packed into a single field for efficiency.  Note that line
     * and column numbers are zero-based -- typically you will want to add
     * 1 to each before displaying to a user.
     */
    @WireField(
        tag = 2,
        adapter = "com.squareup.wire.ProtoAdapter#INT32",
        label = WireField.Label.PACKED
    )
    public final List<Integer> span;

    public Location(List<Integer> path, List<Integer> span) {
      this(path, span, TagMap.EMPTY);
    }

    public Location(List<Integer> path, List<Integer> span, TagMap tagMap) {
      super(tagMap);
      this.path = immutableCopyOf(path);
      this.span = immutableCopyOf(span);
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof Location)) return false;
      Location o = (Location) other;
      return equals(tagMap(), o.tagMap())
          && equals(path, o.path)
          && equals(span, o.span);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      if (result == 0) {
        result = tagMap().hashCode();
        result = result * 37 + (path != null ? path.hashCode() : 1);
        result = result * 37 + (span != null ? span.hashCode() : 1);
        hashCode = result;
      }
      return result;
    }

    public static final class Builder extends com.squareup.wire.Message.Builder<Location, Builder> {
      public List<Integer> path;

      public List<Integer> span;

      public Builder() {
        path = Collections.emptyList();
        span = Collections.emptyList();
      }

      public Builder(Location message) {
        super(message);
        if (message == null) return;
        this.path = copyOf(message.path);
        this.span = copyOf(message.span);
      }

      /**
       * Identifies which part of the FileDescriptorProto was defined at this
       * location.
       *
       * Each element is a field number or an index.  They form a path from
       * the root FileDescriptorProto to the place where the definition.  For
       * example, this path:
       *   [ 4, 3, 2, 7, 1 ]
       * refers to:
       *   file.message_type(3)  // 4, 3
       *       .field(7)         // 2, 7
       *       .name()           // 1
       * This is because FileDescriptorProto.message_type has field number 4:
       *   repeated DescriptorProto message_type = 4;
       * and DescriptorProto.field has field number 2:
       *   repeated FieldDescriptorProto field = 2;
       * and FieldDescriptorProto.name has field number 1:
       *   optional string name = 1;
       *
       * Thus, the above path gives the location of a field name.  If we removed
       * the last element:
       *   [ 4, 3, 2, 7 ]
       * this path refers to the whole field declaration (from the beginning
       * of the label to the terminating semicolon).
       */
      public Builder path(List<Integer> path) {
        checkElementsNotNull(path);
        this.path = path;
        return this;
      }

      /**
       * Always has exactly three or four elements: start line, start column,
       * end line (optional, otherwise assumed same as start line), end column.
       * These are packed into a single field for efficiency.  Note that line
       * and column numbers are zero-based -- typically you will want to add
       * 1 to each before displaying to a user.
       */
      public Builder span(List<Integer> span) {
        checkElementsNotNull(span);
        this.span = span;
        return this;
      }

      @Override
      public Location build() {
        return new Location(path, span, buildTagMap());
      }
    }
  }
}
