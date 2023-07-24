package com.balanici.sandboxkeycloak;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping("/admin")
    @PreAuthorize("hasRole('client_admin')")
    public String adminEndpoint() {
        return "Admin endpoint";
    }

    @GetMapping("/seller")
    @PreAuthorize("hasRole('client_seller')")
    public String sellerEndpoint() {
        return "Seller endpoint";
    }

    @GetMapping("/buyer")
    @PreAuthorize("hasRole('client_buyer')")
    public String buyerEndpoint() {
        return "Buyer endpoint";
    }

}
