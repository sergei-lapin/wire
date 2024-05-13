// Code generated by Wire protocol buffer compiler, do not edit.
// Source: ModelEvaluation in recursive_map.proto
import Wire

/**
 * Copyright 2020 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public struct ModelEvaluation {

    @ProtoDefaulted
    public var name: String?
    @ProtoDefaulted
    public var score: Double?
    public var models: [String : ModelEvaluation] = [:]
    public var unknownFields: UnknownFields = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension ModelEvaluation : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension ModelEvaluation : Hashable {
}
#endif

extension ModelEvaluation : Sendable {
}

extension ModelEvaluation : ProtoDefaultedValue {

    public static var defaultedValue: Self {
        .init()
    }
}

extension ModelEvaluation : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/ModelEvaluation"
    }

}

extension ModelEvaluation : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        var name: String? = nil
        var score: Double? = nil
        var models: [String : ModelEvaluation] = [:]

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: name = try protoReader.decode(String.self)
            case 2: score = try protoReader.decode(Double.self)
            case 3: try protoReader.decode(into: &models)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self._name.wrappedValue = name
        self._score.wrappedValue = score
        self.models = models
    }

    public func encode(to protoWriter: ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.name)
        try protoWriter.encode(tag: 2, value: self.score)
        try protoWriter.encode(tag: 3, value: self.models)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension ModelEvaluation : Codable {

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self._name.wrappedValue = try container.decodeIfPresent(String.self, forKey: "name")
        self._score.wrappedValue = try container.decodeIfPresent(Double.self, forKey: "score")
        self.models = try container.decodeProtoMap([String : ModelEvaluation].self, forKey: "models")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)
        let includeDefaults = encoder.protoDefaultValuesEncodingStrategy == .include

        try container.encodeIfPresent(self.name, forKey: "name")
        try container.encodeIfPresent(self.score, forKey: "score")
        if includeDefaults || !self.models.isEmpty {
            try container.encodeProtoMap(self.models, forKey: "models")
        }
    }

}
#endif
