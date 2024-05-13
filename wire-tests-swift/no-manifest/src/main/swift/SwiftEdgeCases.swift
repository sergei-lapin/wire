// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.swift_modules.SwiftEdgeCases in swift_edge_cases.proto
import Wire

public struct SwiftEdgeCases {

    @ProtoDefaulted
    public var `return`: String?
    public var unknownFields: UnknownFields = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension SwiftEdgeCases : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension SwiftEdgeCases : Hashable {
}
#endif

extension SwiftEdgeCases : Sendable {
}

extension SwiftEdgeCases : ProtoDefaultedValue {

    public static var defaultedValue: Self {
        .init()
    }
}

extension SwiftEdgeCases : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos.kotlin.swift_modules.SwiftEdgeCases"
    }

}

extension SwiftEdgeCases : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        var `return`: String? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: `return` = try protoReader.decode(String.self)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self._return.wrappedValue = `return`
    }

    public func encode(to protoWriter: ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.`return`)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension SwiftEdgeCases : Codable {

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self._return.wrappedValue = try container.decodeIfPresent(String.self, forKey: "return")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)

        try container.encodeIfPresent(self.`return`, forKey: "return")
    }

}
#endif
