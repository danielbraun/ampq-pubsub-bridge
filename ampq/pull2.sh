/usr/local/Cellar/rabbitmq/3.7.16/sbin/rabbitmqadmin \
    --config=mq.conf \
    --ssl \
    get queue=myqueue ackmode=ack_requeue_false --format=raw_json
