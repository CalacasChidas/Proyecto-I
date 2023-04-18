int w = 2;
int a = 3;
int s = 4;
int d = 5;
int enter = 6;

int led = 8;
int sound = 9;

int bs1 = 0;
int bs2 = 0;
int bs3 = 0;
int bs4 = 0;
long interval = 500;
String ledStr = "led";
String soundNM = "tunenm";
String soundM = "tunem";
long previousMillis = 0;
void setup() {
  pinMode(w, INPUT);
  pinMode(a, INPUT);
  pinMode(s, INPUT);
  pinMode(d, INPUT);
  pinMode(led, OUTPUT);
  Serial.begin(9600);
}
void loop() {
  if(digitalRead(w) == HIGH){
      Serial.write("w");
    }
    if(digitalRead(a) == HIGH){
      Serial.write("a");
    }
    if(digitalRead(s) == HIGH){
      Serial.write("s");
    }
    if(digitalRead(d) == HIGH){
      Serial.write("d");
    }
    if(digitalRead(enter) == HIGH){
      Serial.write("e");
    }
  if(Serial.available()>0){
    unsigned long currentMillis = millis();
    String cad = Serial.readString();
    if(ledStr.compareTo(cad)==0){
      digitalWrite(led, HIGH);
      delay(1000);
      digitalWrite(led, LOW);
      delay(1000);
      digitalWrite(led, HIGH);
      delay(1000);
      digitalWrite(led, LOW);
      delay(1000);
    }
    if(soundNM.compareTo(cad)==0){
      tone(9, 2000);
      delay(1000);
      noTone(9);
      previousMillis = currentMillis;
    }
    if(soundM.compareTo(cad)==0){
      tone(9, 2500);
      delay(500);
      tone(9, 2000);
      delay(1000);
      noTone(9);
      previousMillis = currentMillis;
    }
    if(digitalRead(w) == HIGH){
      //Serial.println("w");
      digitalWrite(led, HIGH);
      delay(1000);
      digitalWrite(led, LOW);
    }
    else if(currentMillis - previousMillis > interval){ 
      noTone(9);
      digitalWrite(led, LOW); 
    }
  }
}
