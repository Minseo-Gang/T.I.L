int led = 12;
int key = 11;
int status = LOW;

void setup() {
  pinMode(led, OUTPUT);
  pinMode(key, INPUT);
}

void loop() {
  // 버튼을 누르면
  if(digitalRead(key) == HIGH) {
    // LED가 꺼진상태인지 체크함
    if(status == LOW) {
      digitalWrite(led, HIGH);
      status = HIGH;
     } else { // LED가 켜져있다면
      digitalWrite(led, LOW);
      status = LOW;
     }
  }
    delay(100); // 0.1초
}
