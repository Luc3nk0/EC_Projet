package be.heh.ec.ecproject.customer.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class Customer {
    @Getter
    @Setter
    private final int id;
    @Getter
    @Setter
    private final String firstname;
    @Getter
    @Setter
    private final String lastname;
    @Getter
    @Setter
    private final String email;
}
