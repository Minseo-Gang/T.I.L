int buzzer = 3;
int pins[] = {6, 7, 8, 9, 10};
int notes[] = {262, 294, 330, 350, 392}; 
// -> C(도), D(레), E(미), F(파), G(솔)

void setup() {
  Serial.begin(9600);
  pinMode(buzzer, OUTPUT);
  for(int i = 0; i < 5; i++) {
    pinMode(pins[i], INPUT);
  }
}

void loop() {
  for(int i = 0; i < 5; i++) {
    if(digitalRead(pins[i]) == HIGH) {
       Serial.print(pins[i]);
      tone(buzzer, notes[i], 100);
      //핀번호, 프리퀀시, 지속시간
      delay(200);
      noTone(buzzer);
    } 
  }
}
