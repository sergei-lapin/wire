// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.unknownfields.VersionTwo in unknown_fields.proto
import Wire

public struct VersionTwo {

    @ProtoDefaulted
    public var i: Int32?
    @ProtoDefaulted
    public var v2_i: Int32?
    @ProtoDefaulted
    public var v2_s: String?
    @ProtoDefaulted
    public var v2_f32: UInt32?
    @ProtoDefaulted
    public var v2_f64: UInt64?
    public var v2_rs: [String] = []
    @ProtoDefaulted
    public var obj: NestedVersionTwo?
    public var en: EnumVersionTwo?
    public var unknownFields: UnknownFields = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension VersionTwo : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension VersionTwo : Hashable {
}
#endif

extension VersionTwo : Sendable {
}

extension VersionTwo : ProtoDefaultedValue {

    public static var defaultedValue: Self {
        .init()
    }
}

extension VersionTwo : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos.kotlin.unknownfields.VersionTwo"
    }

}

extension VersionTwo : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        var i: Int32? = nil
        var v2_i: Int32? = nil
        var v2_s: String? = nil
        var v2_f32: UInt32? = nil
        var v2_f64: UInt64? = nil
        var v2_rs: [String] = []
        var obj: NestedVersionTwo? = nil
        var en: EnumVersionTwo? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: i = try protoReader.decode(Int32.self, encoding: .variable)
            case 2: v2_i = try protoReader.decode(Int32.self, encoding: .variable)
            case 3: v2_s = try protoReader.decode(String.self)
            case 4: v2_f32 = try protoReader.decode(UInt32.self, encoding: .fixed)
            case 5: v2_f64 = try protoReader.decode(UInt64.self, encoding: .fixed)
            case 6: try protoReader.decode(into: &v2_rs)
            case 7: obj = try protoReader.decode(NestedVersionTwo.self)
            case 8: en = try protoReader.decode(EnumVersionTwo.self)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self._i.wrappedValue = i
        self._v2_i.wrappedValue = v2_i
        self._v2_s.wrappedValue = v2_s
        self._v2_f32.wrappedValue = v2_f32
        self._v2_f64.wrappedValue = v2_f64
        self.v2_rs = v2_rs
        self._obj.wrappedValue = obj
        self.en = en
    }

    public func encode(to protoWriter: ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.i, encoding: .variable)
        try protoWriter.encode(tag: 2, value: self.v2_i, encoding: .variable)
        try protoWriter.encode(tag: 3, value: self.v2_s)
        try protoWriter.encode(tag: 4, value: self.v2_f32, encoding: .fixed)
        try protoWriter.encode(tag: 5, value: self.v2_f64, encoding: .fixed)
        try protoWriter.encode(tag: 6, value: self.v2_rs)
        try protoWriter.encode(tag: 7, value: self.obj)
        try protoWriter.encode(tag: 8, value: self.en)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension VersionTwo : Codable {

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self._i.wrappedValue = try container.decodeIfPresent(Int32.self, forKey: "i")
        self._v2_i.wrappedValue = try container.decodeIfPresent(Int32.self, firstOfKeys: "v2I", "v2_i")
        self._v2_s.wrappedValue = try container.decodeIfPresent(String.self, firstOfKeys: "v2S", "v2_s")
        self._v2_f32.wrappedValue = try container.decodeIfPresent(UInt32.self, firstOfKeys: "v2F32", "v2_f32")
        self._v2_f64.wrappedValue = try container.decodeIfPresent(stringEncoded: UInt64.self, firstOfKeys: "v2F64", "v2_f64")
        self.v2_rs = try container.decodeProtoArray(String.self, firstOfKeys: "v2Rs", "v2_rs")
        self._obj.wrappedValue = try container.decodeIfPresent(NestedVersionTwo.self, forKey: "obj")
        self.en = try container.decodeIfPresent(EnumVersionTwo.self, forKey: "en")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)
        let preferCamelCase = encoder.protoKeyNameEncodingStrategy == .camelCase
        let includeDefaults = encoder.protoDefaultValuesEncodingStrategy == .include

        try container.encodeIfPresent(self.i, forKey: "i")
        try container.encodeIfPresent(self.v2_i, forKey: preferCamelCase ? "v2I" : "v2_i")
        try container.encodeIfPresent(self.v2_s, forKey: preferCamelCase ? "v2S" : "v2_s")
        try container.encodeIfPresent(self.v2_f32, forKey: preferCamelCase ? "v2F32" : "v2_f32")
        try container.encodeIfPresent(stringEncoded: self.v2_f64, forKey: preferCamelCase ? "v2F64" : "v2_f64")
        if includeDefaults || !self.v2_rs.isEmpty {
            try container.encodeProtoArray(self.v2_rs, forKey: preferCamelCase ? "v2Rs" : "v2_rs")
        }
        try container.encodeIfPresent(self.obj, forKey: "obj")
        try container.encodeIfPresent(self.en, forKey: "en")
    }

}
#endif
