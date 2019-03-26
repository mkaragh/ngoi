package org.dxc.ngoi.order.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class XCBLOrderConsumer {

    private final Logger logger = LoggerFactory.getLogger(XCBLOrderConsumer.class);

    @KafkaListener(topics = "INBOUND_CXML_ORDER_TOPIC", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}
