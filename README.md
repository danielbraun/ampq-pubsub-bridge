# ampq-pubsub-bridge

```
$ ampq | gpubsub
$ gpubsub | ampq
```

## Unix solutions:
* https://www.rabbitmq.com/management-cli.html (rabbitmqadmin)
* https://cloud.google.com/pubsub/docs/quickstart-cli (gcloud cli)

## Programming solutions:
Adjacent Implementations:
* https://github.com/subzerocloud/pg-amqp-bridge (AMPQ<->PostgreSQL) Bridge

Existing Implementations:
* https://github.com/Agosto/gcp-iot-adapter (Elixir)

Clojure Libraries:
* https://github.com/michaelklishin/langohr (Clojure RabbitMQ library)
* https://github.com/iprally/jonotin (Clojure Google Cloud Pub/Sub)
* https://github.com/magnetcoop/pubsub (AMPQ Integrant/Duct library)
* https://github.com/ovotech/clj-gcp (PubSub Integrant/Duct library)
* https://github.com/Data-Rx/google-cloud (Google Cloud functions)

REST API's:
* https://cloud.google.com/pubsub/docs/reference/rest/#rest-resource-v1projectstopicssubscriptions (Google Pub/Sub API)
* https://www.cloudamqp.com/docs/http.html (AMQP API)
* https://whale.rmq.cloudamqp.com/api/index.html (AMQP API)


Process type: Background Service

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
