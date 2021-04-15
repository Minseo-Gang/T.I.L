int buzzer = 10;
int status = LOW;

void setup() {
  pinMode(buzzer, OUTPUT); //3번핀 출력모드
}

void loop() {
 // digitalWrite(buzzer, HIGH);
 // delay(1000);
 // digitalWrite(buzzer, LOW);
 // delay(1000);

  if(status == LOW) {
    digitalWrite(buzzer, HIGH);
    status = HIGH;
    } else {
    digitalWrite(buzzer, LOW);
    status = LOW;  
    }
  delay(100);
}
