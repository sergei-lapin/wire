// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.OtherMessageWithStatus in same_name_enum.proto
import Foundation
import Wire

public struct OtherMessageWithStatus {

    public var unknownFields: Foundation.Data = .init()

    public init() {
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension OtherMessageWithStatus : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension OtherMessageWithStatus : Hashable {
}
#endif

#if swift(>=5.5)
extension OtherMessageWithStatus : Sendable {
}
#endif

extension OtherMessageWithStatus : ProtoDefaultedValue {

    public static var defaultedValue: OtherMessageWithStatus {
        OtherMessageWithStatus()
    }
}

extension OtherMessageWithStatus : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.OtherMessageWithStatus"
    }

}

extension OtherMessageWithStatus : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension OtherMessageWithStatus : Codable {

    public enum CodingKeys : Swift.CodingKey {
    }

}
#endif

/**
 * Subtypes within OtherMessageWithStatus
 */
extension OtherMessageWithStatus {

    public enum Status : Swift.Int32, Swift.CaseIterable, Wire.ProtoEnum {

        case A = 1

        public var description: Swift.String {
            switch self {
            case .A: return "A"
            }
        }

    }

}

#if swift(>=5.5)
extension OtherMessageWithStatus.Status : Sendable {
}
#endif
