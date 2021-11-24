JAVACOMPILER = javac
JAVAATTRIBUTES = -g
default: DecryptionCode.class EncryptionCode.class
DecryptionCode.class: DecryptionCode.java
	$(JAVACOMPILER) $(JAVAATTRIBUTES) DecryptionCode.java
EncryptionCode.class: EncryptionCode.java
	$(JAVACOMPILER) $(JAVAATTRIBUTES) EncryptionCode.java
clean:
	$(RM) *.class
