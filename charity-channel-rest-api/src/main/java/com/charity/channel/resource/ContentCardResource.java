package com.charity.channel.resource;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
public class ContentCardResource extends ResourceSupport {
  private ContentResource comtent;
  private UserViewResource view;
  private UserCommentResource comment;
  private UserReactionResource reaction;
}
