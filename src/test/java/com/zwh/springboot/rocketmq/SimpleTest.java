package com.zwh.springboot.rocketmq;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.junit.Test;

public class SimpleTest {

    @Test
    public void sendMessage() {
        try {
            SyncProducer syncProducer = new SyncProducer();
            syncProducer.send();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class SyncProducer {
        private static final String PRODUCER_GROUP_NAME = "simple_test_sync_producer_group";
        public static final String NAME_SERVER_ADDR = "47.104.103.95:9876";

        public void send() throws Exception {
            //Instantiate with a producer group name.
            DefaultMQProducer producer = new DefaultMQProducer(PRODUCER_GROUP_NAME);
            // Specify name server addresses.
            producer.setNamesrvAddr(NAME_SERVER_ADDR);
            producer.setSendMsgTimeout(10000);
            producer.setVipChannelEnabled(false);
            //Launch the instance.
            producer.start();
            for (int i = 0; i < 100; i++) {
                //Create a message instance, specifying topic, tag and message body.
                Message msg = new Message("TopicTest" /* Topic */,
                        "TagA" /* Tag */,
                        ("Hello RocketMQ " +
                                i).getBytes(RemotingHelper.DEFAULT_CHARSET) /* Message body */
                );
                //Call send message to deliver message to one of brokers.
                SendResult sendResult = producer.send(msg);
                System.out.printf("%s%n", sendResult);
            }
            //Shut down once the producer instance is not longer in use.
            producer.shutdown();
        }
    }
}
