/usr/local/Cellar/rabbitmq/3.7.16/sbin/rabbitmqadmin \
        --host=whale.rmq.cloudamqp.com \
        --port=443 \
        --ssl \
        --vhost=cmluenzn \
        --username=cmluenzn \
        --password=ekvVl9d6y5QtuW9XDodKk_7ts05qHdqo \
        get queue=myqueue ackmode=ack_requeue_false --format=raw_json
