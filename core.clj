(ns ampq-pubsub-bridge.core
  (:require [clj-http.client :as http]
            [iprally.jonotin :as pubsub]
            ampqe))


(pubsub/publish! {:project-name project
                  :topic-name "mytopic"
                  :messages ["hello"]})


(pubsub/subscribe! {:project-name project
                    :subscription-name "my-sub"
                    :batch-size 10
                    :handle-msg-fn prn}
                   )

(comment (:body
          (http/get (format "https://pubsub.googleapis.com/v1/projects/vivid-motif-256913/topics/mytopic")
                    {:query-params {:key api-key}
                     :throw-exceptions? false})))

;curl -XGET https://username:password@hostname/api/queues/your_vhost/your_queue

;publish



