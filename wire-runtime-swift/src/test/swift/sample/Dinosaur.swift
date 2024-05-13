// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.dinosaurs.Dinosaur in squareup/dinosaurs/dinosaur.proto
import Wire

public struct Dinosaur {

    /**
     * Common name of this dinosaur, like "Stegosaurus".
     */
    @ProtoDefaulted
    public var name: String?
    /**
     * URLs with images of this dinosaur.
     */
    public var picture_urls: [String] = []
    @ProtoDefaulted
    public var length_meters: Double?
    @ProtoDefaulted
    public var mass_kilograms: Double?
    public var period: Period?
    public var unknownFields: UnknownFields = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension Dinosaur : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Dinosaur : Hashable {
}
#endif

extension Dinosaur : Sendable {
}

extension Dinosaur : ProtoDefaultedValue {

    public static var defaultedValue: Self {
        .init()
    }
}

extension Dinosaur : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.dinosaurs.Dinosaur"
    }

}

extension Dinosaur : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        var name: String? = nil
        var picture_urls: [String] = []
        var length_meters: Double? = nil
        var mass_kilograms: Double? = nil
        var period: Period? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: name = try protoReader.decode(String.self)
            case 2: try protoReader.decode(into: &picture_urls)
            case 3: length_meters = try protoReader.decode(Double.self)
            case 4: mass_kilograms = try protoReader.decode(Double.self)
            case 5: period = try protoReader.decode(Period.self)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self._name.wrappedValue = name
        self.picture_urls = picture_urls
        self._length_meters.wrappedValue = length_meters
        self._mass_kilograms.wrappedValue = mass_kilograms
        self.period = period
    }

    public func encode(to protoWriter: ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.name)
        try protoWriter.encode(tag: 2, value: self.picture_urls)
        try protoWriter.encode(tag: 3, value: self.length_meters)
        try protoWriter.encode(tag: 4, value: self.mass_kilograms)
        try protoWriter.encode(tag: 5, value: self.period)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Dinosaur : Codable {

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self._name.wrappedValue = try container.decodeIfPresent(String.self, forKey: "name")
        self.picture_urls = try container.decodeProtoArray(String.self, firstOfKeys: "pictureUrls", "picture_urls")
        self._length_meters.wrappedValue = try container.decodeIfPresent(Double.self, firstOfKeys: "lengthMeters", "length_meters")
        self._mass_kilograms.wrappedValue = try container.decodeIfPresent(Double.self, firstOfKeys: "massKilograms", "mass_kilograms")
        self.period = try container.decodeIfPresent(Period.self, forKey: "period")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)
        let preferCamelCase = encoder.protoKeyNameEncodingStrategy == .camelCase
        let includeDefaults = encoder.protoDefaultValuesEncodingStrategy == .include

        try container.encodeIfPresent(self.name, forKey: "name")
        if includeDefaults || !self.picture_urls.isEmpty {
            try container.encodeProtoArray(self.picture_urls, forKey: preferCamelCase ? "pictureUrls" : "picture_urls")
        }
        try container.encodeIfPresent(self.length_meters, forKey: preferCamelCase ? "lengthMeters" : "length_meters")
        try container.encodeIfPresent(self.mass_kilograms, forKey: preferCamelCase ? "massKilograms" : "mass_kilograms")
        try container.encodeIfPresent(self.period, forKey: "period")
    }

}
#endif
