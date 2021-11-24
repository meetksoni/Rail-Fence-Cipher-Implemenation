# Rail-Fence-Cipher-Implemenation
# Assignment: Rail-Fence Cipher Implementation

This project includes the implementation of the encryption and decryption algorithms of the Rail-Fence Cipher. There are two source codes, one for rail-fence cipher encryption and the other for rail-fence cipher decryption.

## Installation

Java programming language is used to implement both the encryption and decryption algorithms. To setup the environment for running the programs, follow the below steps in unix terminal.

Install the java development kit
```bash
sudo apt-get install default-jdk
```

Install the java runtime environment
```bash
sudo apt-get install default-jre
```

## How to Run the Source Codes

The following steps will compile and run the programs. In the unix terminal,
1. Move to the directory (For example, say, /home/assignment/) where the files "EncryptionCode.java", "DecryptionCode.java" and "makefile" are located.
```bash
cd /home/assignment/
```

2. Type the following command to automate the building/compilation process.
```bash
make
```

3. Two new files namely, "EncryptionCode.class" and "DecryptionCode.class" will be created in the same directory. To check those newly created files, type the ls command.
```bash
ls
```

4. Use the command java <filename>, where EncryptionCode is the <filename> for the file "EncryptionCode.class" to run the Rail-Fence Cipher Encryption Algorithm.
```bash
java EncryptionCode
```
(a). This will prompt the user to enter the plain text. Thus, type the plain text, For Example "CRYPTOLOGY IS THE PRACTICE AND STUDY OF TECHNIQUES FOR SECURE COMMUNICATION IN THE PRESENCE OF THIRD PARTIES CALLED ADVERSARIES", without the quotation marks, and press Enter.

(b). Then, it will ask to enter the depth. Thus, type the value of depth, For example, 4, and press  Enter.

(c). Lastly, it will prompt to enter the r(the number of times to do encryption). Hence, type the value of r, for example, 5, and press Enter.

This will give the result of the encryption code.

5. Again, use the command java <filename>, where DecryptionCode is the <filename> for the file "DecryptionCode.class", to run the Rail-Fence Cipher Decryption Algorithm.
```bash
java DecryptionCode
```
(a). This will prompt the user to enter the cipher text. Thus, type the cipher text, For Example "TAOTINEN KAT I ODIOAEI OHHLSCTE TTETOEL BI IHI GAO   EPSEA TO SS  EEK  ELRCPTSIY EANRPHMCYEK E CREAAIEJURTE  IEASHI MA DRN RH  AUWTA RF EFTFHENTPSF Q   TAILB E TTECAPMSIYIY SRPURNTBL YCL OANAO  E  TVREAOSHOTTNULSRHK", without the quotation marks, and press Enter.

(b). Then, it will ask to enter the depth. Thus, type the value of depth, For example, 3, and press  Enter.

(c). Lastly, it will prompt to enter the value of r (the number of times to do decryption). Hence, type the value of r, for example, 3, and press Enter.

This will give the result of the decryption code.


## Author:

  Meet Soni
