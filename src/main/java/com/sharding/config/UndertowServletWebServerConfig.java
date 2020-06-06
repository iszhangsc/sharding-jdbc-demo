package com.sharding.config;

import io.undertow.server.DefaultByteBufferPool;
import io.undertow.websockets.jsr.WebSocketDeploymentInfo;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;
import org.xnio.Options;

import java.beans.Customizer;

/**
 * <p>
 * 忽略 Undertow警告配置:
 * </p>
 * Buffer pool was not set on WebSocketDeploymentInfo
 *
 * @author zhangshichang
 * @date 2020/2/28 下午6:36
 */
@Configuration
public class UndertowServletWebServerConfig implements WebServerFactoryCustomizer<UndertowServletWebServerFactory> {

    @Override
    public void customize(UndertowServletWebServerFactory factory) {
        factory.addDeploymentInfoCustomizers(deploymentInfo -> {
            WebSocketDeploymentInfo webSocketDeploymentInfo = new WebSocketDeploymentInfo();
            webSocketDeploymentInfo.setBuffers(new DefaultByteBufferPool(false, 1024));
            deploymentInfo.addServletContextAttribute("io.undertow.websockets.jsr.WebSocketDeploymentInfo",
                    webSocketDeploymentInfo);
        });
        factory.addBuilderCustomizers(customize -> {
            customize.setWorkerOption(Options.WORKER_NAME, "Sharding-JDBC-Demo");
        });
    }

}
