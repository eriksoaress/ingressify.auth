package insper.ingressify.auth;

import lombok.Builder;
import lombok.experimental.Accessors;
@Builder
@Accessors(fluent = true, chain = true)
public record LoginOut (
    String id,
    String name,
    String email,
    String token
){

}