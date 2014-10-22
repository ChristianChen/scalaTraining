package concurrency.akka.pingpang

import akka.actor.{Actor, ActorLogging}

class Ping extends Actor with ActorLogging{
  override def receive: Receive = ???
}
