package com.charity.channel.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Data
@Setter
@Getter
@JsonInclude(Include.NON_DEFAULT)
public class ImageDTO  implements Serializable{
	 /**
	 *
	 */
	private static final long serialVersionUID = 4561064317539899650L;
	private Long imageContentId;
	 private String imageUrl;
}
