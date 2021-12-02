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
    private final String firstName;
    @Getter
    @Setter
    private final String lastName;
    @Getter
    @Setter
    private final String email;
}
