function reverseWords(str) {

    let words = str.split(" ");
    let reversedString = "";

    for (let i = 0; i < words.length; i++) 
    {
        let word = words[i];

        let reverseWord = "";
        for (let j = word.length - 1; j >= 0; j--)
         {
            reverseWord = reverseWord + word.charAt(j);
        }
        reversedString = reversedString + reverseWord + " ";
    }

    console.log("Reversed word :"+" "+reversedString);
}


let inputString = prompt("Enter a string :");
reverseWords(inputString);
