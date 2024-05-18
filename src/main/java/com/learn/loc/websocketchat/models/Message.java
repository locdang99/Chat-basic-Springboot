package com.learn.loc.websocketchat.models;

import com.learn.loc.websocketchat.types.MessageType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
	private MessageType type;
	private String content;
	private String sender;
}
