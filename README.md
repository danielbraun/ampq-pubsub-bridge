ampq-pubsub-bridge
==================

Adjacent Implementations:
* https://github.com/subzerocloud/pg-amqp-bridge (AMPQ<->PostgreSQL) Bridge

Existing Implementations:
* https://github.com/Agosto/gcp-iot-adapter (Elixir)

Clojure Libraries:
* https://github.com/michaelklishin/langohr (Clojure RabbitMQ library)
* https://github.com/iprally/jonotin (Clojure Google Cloud Pub/Sub)

Solution outline:
```
while service is running:
  if ampq->pubsub mode:
    subscribe to the queue
    publish every message to google pubsub
  if pubsub->ampq mode:
    subscribe to google pubsub
    publish every message recieved to the ampq queue
```
