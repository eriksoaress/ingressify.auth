package insper.ingressify.auth;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder @Accessors(fluent = true, chain = true)
public record CredetalIn(
    String email,
    String password
) {}