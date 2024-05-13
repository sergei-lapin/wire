// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.swift_modules.Screen in swift_edge_cases.proto
import Wire

public struct Screen {

    public var screen: Screen?
    public var unknownFields: UnknownFields = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension Screen : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Screen : Hashable {
}
#endif

extension Screen : Sendable {
}

extension Screen : ProtoDefaultedValue {

    public static var defaultedValue: Self {
        .init()
    }
}

extension Screen : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos.kotlin.swift_modules.Screen"
    }

}

extension Screen : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        var screen: Screen? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: screen = .oneof_string(try protoReader.decode(String.self))
            case 2: screen = .oneof_int32(try protoReader.decode(Int32.self))
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self.screen = screen
    }

    public func encode(to protoWriter: ProtoWriter) throws {
        if let screen = self.screen {
            try screen.encode(to: protoWriter)
        }
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Screen : Codable {

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        if let oneof_string = try container.decodeIfPresent(String.self, forKey: "oneofString") {
            self.screen = .oneof_string(oneof_string)
        } else if let oneof_string = try container.decodeIfPresent(String.self, forKey: "oneof_string") {
            self.screen = .oneof_string(oneof_string)
        } else if let oneof_int32 = try container.decodeIfPresent(Int32.self, forKey: "oneofInt32") {
            self.screen = .oneof_int32(oneof_int32)
        } else if let oneof_int32 = try container.decodeIfPresent(Int32.self, forKey: "oneof_int32") {
            self.screen = .oneof_int32(oneof_int32)
        } else {
            self.screen = nil
        }
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)
        let preferCamelCase = encoder.protoKeyNameEncodingStrategy == .camelCase

        switch self.screen {
        case .oneof_string(let oneof_string): try container.encode(oneof_string, forKey: preferCamelCase ? "oneofString" : "oneof_string")
        case .oneof_int32(let oneof_int32): try container.encode(oneof_int32, forKey: preferCamelCase ? "oneofInt32" : "oneof_int32")
        case Optional.none: break
        }
    }

}
#endif

/**
 * Subtypes within Screen
 */
extension Screen {

    public enum Screen {

        case oneof_string(String)
        case oneof_int32(Int32)

        fileprivate func encode(to protoWriter: ProtoWriter) throws {
            switch self {
            case .oneof_string(let oneof_string): try protoWriter.encode(tag: 1, value: oneof_string)
            case .oneof_int32(let oneof_int32): try protoWriter.encode(tag: 2, value: oneof_int32)
            }
        }

    }

}

#if !WIRE_REMOVE_EQUATABLE
extension Screen.Screen : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Screen.Screen : Hashable {
}
#endif

extension Screen.Screen : Sendable {
}
