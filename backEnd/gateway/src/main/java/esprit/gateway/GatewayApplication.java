package esprit.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("candidat",r->r.path("/Mic1/**")
                        .uri("lb://candidat"))

                .route("job",r->r.path("/Mic2/**")
                        .uri("lb://job"))

                .route("candidature",r->r.path("/Mic3/**")
                        .uri("lb://candidature"))


                .route("meeting",r->r.path("/Mic5/**")
                        .uri("lb://meeting"))

                .route("notification",r->r.path("/Mic4/**")
                        .uri("lb://notification"))

                .build();
     }

}
