//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable() // Consider enabling CSRF protection for production (refer to note)
//                .authorizeHttpRequests(auth -> auth
//                        .mvcMatchers(HttpMethod.GET, "/api/users/names").permitAll()
//                        .mvcMatchers(HttpMethod.GET, "/api/visitors/names").permitAll()
//                        .mvcMatchers(HttpMethod.GET, "/api/passes/dtos").permitAll()
//                        .anyRequest().authenticated())
//                .formLogin(); // Use form login
//
//        // Optional: Enable method-level security (consider for granular control)
//        // http.securityMatcher(RequestMatcher -> RequestMatcher.anyRequest())
//        //      .addCsrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//        //      .and()
//        //      .authorizeRequests(auth -> auth.antMatchers("/login").permitAll()
//        //                                       .anyRequest().authenticated())
//        //      .formLogin()
//        //      .and()
//        //      .csrf().and()
//        //      .methodSecurity()
//        //      .antMatchers(HttpMethod.POST, "/api/users").hasRole("ADMIN")
//        //      .and();
//    }
//}
