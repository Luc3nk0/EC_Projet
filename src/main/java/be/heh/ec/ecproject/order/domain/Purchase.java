package be.heh.ec.ecproject.order.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public class Purchase {
    @Getter
    @Setter
    private final String customerName;
    @Getter
    @Setter
    private final String customerLastName;
    @Getter
    @Setter
    private final String email;
    @Getter
    @Setter
    private final List carlist;
}
