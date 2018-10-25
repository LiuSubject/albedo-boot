package com.albedo.java.common.config.apidoc.customizer;

import com.google.common.collect.Lists;
import com.albedo.java.common.config.AlbedoSwaggerProperties;
import org.springframework.core.Ordered;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AlbedoSwaggerCustomizer implements SwaggerCustomizer, Ordered {
    public static final int DEFAULT_ORDER = 0;
    private int order = 0;
    private final AlbedoSwaggerProperties AlbedoSwaggerProperties;

    public AlbedoSwaggerCustomizer(AlbedoSwaggerProperties AlbedoSwaggerProperties) {
        this.AlbedoSwaggerProperties = AlbedoSwaggerProperties;
    }
    private List<ApiKey> securitySchemes() {
        return Lists.newArrayList(new ApiKey[]{new ApiKey("Authorization", "Authorization", "header")});
    }

    private List<SecurityContext> securityContexts() {
        return Lists.newArrayList(new SecurityContext[]{SecurityContext.builder().securityReferences(this.defaultAuth()).forPaths(PathSelectors.regex("^(?!auth).*$")).build()});
    }

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[]{authorizationScope};
        return Lists.newArrayList(new SecurityReference[]{new SecurityReference("Authorization", authorizationScopes)});
    }
    @Override
    public void customize(Docket docket) {
        Contact contact = new Contact(this.AlbedoSwaggerProperties.getContactName(), this.AlbedoSwaggerProperties.getContactUrl(), this.AlbedoSwaggerProperties.getContactEmail());
        ApiInfo apiInfo = new ApiInfo(this.AlbedoSwaggerProperties.getTitle(), this.AlbedoSwaggerProperties.getDescription(), this.AlbedoSwaggerProperties.getVersion(), this.AlbedoSwaggerProperties.getTermsOfServiceUrl(), contact, this.AlbedoSwaggerProperties.getLicense(), this.AlbedoSwaggerProperties.getLicenseUrl(), new ArrayList());
        docket.host(this.AlbedoSwaggerProperties.getHost())
            .protocols(new HashSet(Arrays.asList(this.AlbedoSwaggerProperties.getProtocols())))
            .apiInfo(apiInfo).useDefaultResponseMessages(this.AlbedoSwaggerProperties.isUseDefaultResponseMessages())
            .forCodeGeneration(true)
            .securitySchemes(this.securitySchemes()).securityContexts(this.securityContexts())
            .directModelSubstitute(ByteBuffer.class, String.class)
            .genericModelSubstitutes(new Class[]{ResponseEntity.class}).select()
            .paths(PathSelectors.regex(this.AlbedoSwaggerProperties.getDefaultIncludePattern())).build();
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int getOrder() {
        return this.order;
    }
}
