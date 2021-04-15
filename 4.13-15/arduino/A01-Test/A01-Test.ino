void setup() { // 한번만 실행됨
  pinMode(13, OUTPUT);
  pinMode(12, OUTPUT);
}

void loop() { // 계속 반복 실행함 = while(true)
 digitalWrite(13, HIGH);
 delay(1000);
 digitalWrite(13, LOW);
 delay(1000);
 digitalWrite(12, HIGH);
 delay(1000);
 digitalWrite(12, LOW);
 delay(1000);

}
