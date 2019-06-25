
(function () {
    var questionArray = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
    let counter = 1;
    var correctAnswers = 0;
    Array.prototype.random = function (length) {
        return this[Math.floor((Math.random() * length))];
    }
    var radioBtn1 = false;
    var radioBtn2 = false;
    var radioBtn3 = false;
    var radioBtn4 = false;
    var questions =
        [
            {
                id: 0,
                text: 'India is a federal union comprising twenty-nine states and how many union territories?',
                options: ['6', '7', '8', '9'],
                answer: 1
            },
            {
                id: 1,
                text: ' Which of the following is the capital of Arunachal Pradesh?',
                options: ['Itanagar', 'Dispur', 'Imphal', 'Shillong'],
                answer: 0
            },
            {
                id: 2,
                text: 'What are the major languages spoken in Andhra Pradesh?',
                options: [' English and Telugu', 'Telugu and Urdu', 'Telugu and Kannada', ' All of the above languages'],
                answer: 1
            },
            {
                id: 3,
                text: 'What is the state flower of Haryana?',
                options: ['Lotus', 'Rhododendron', 'Golden Shower', 'Not declared'],
                answer: 0
            },
            {
                id: 4,
                text: ' Which of the following states is not located in the North?',
                options: ['Jharkhand', 'Jammu and Kashmir', 'Himachal Pradesh', 'Haryana'],
                answer: 0
            },
            {
                id: 5,
                text: 'In which state is the main language Khasi?',
                options: ['Mizoram', 'Nagaland', 'Meghalaya', 'Tripura'],

                answer: 2
            },
            {
                id: 6,
                text: 'Which state has Almond as its State Tree?',
                options: ['Himachal Pradesh', 'Goa', 'Jammu and Kashmir', 'Arunachal Pradesh'],
                answer: 1
            },
            {
                id: 7,
                text: ' Which state has the largest area',
                options: ['Maharashtra', 'Madhya Pradesh', 'Uttar Pradesh', 'Rajasthan'],
                answer: 3
            },
            {
                id: 8,
                text: 'Which state has the largest population?',
                options: ['Uttar Pradesh', 'Maharastra', 'Bihar', 'Andra Pradesh'],
                answer: 0
            },
            {
                id: 9,
                text: 'In what state are the Elephant Falls located?',
                options: ['Mizoram', 'Orissa', 'Manipur', 'Meghalaya'],
                answer: 3
            },
        ]


    var startButton = document.querySelector('#startbtn');
    var count = document.querySelector('#attempted');
    var nextButton = document.querySelector('#nextbtn');

    startButton.addEventListener("click", startQuiz);
    nextButton.addEventListener("click", nextQuestion);

    var questionDisplayer = document.querySelector('#question');
    var option1 = document.querySelector('#option1');
    var option2 = document.querySelector('#option2');
    var option3 = document.querySelector('#option3');
    var option4 = document.querySelector('#option4');

    function startQuiz() {
        pickQuestion();
        startButton.style.display = "none";

    }

    function pickQuestion() {
        var question = questions.random(questions.length);
        questions.splice(questions.length - 1, question.id);
        var option = question.options;
        var answer = question.answer;

        questionDisplayer.innerHTML = question.text;
        option1.innerHTML = '<input id="myRadio1" type="radio" name="radio"><span class="checkmark"></span>' + option[0];
        option2.innerHTML = '<input id="myRadio2" type="radio" name="radio"><span class="checkmark"></span>' + option[1];
        option3.innerHTML = '<input id="myRadio3" type="radio" name="radio"><span class="checkmark"></span>' + option[2];
        option4.innerHTML = '<input id="myRadio4" type="radio" name="radio"><span class="checkmark"></span>' + option[3];
        count.innerHTML = "Current Question : " + counter + "/5";
        counter++;

        radioBtn1 = document.getElementById("myRadio1").onclick = function () {
            if (answer == 0) {
                correctAnswers++;
                console.log("Correct");
                return;
            }
        };
        radioBtn2 = document.getElementById("myRadio2").onclick = function () {
            if (answer == 1) {
                console.log("Correct");
                correctAnswers++;
                return;
            }
        };
        radioBtn3 = document.getElementById("myRadio3").onclick = function () {
            if (answer == 2) {
                console.log("Correct");
                correctAnswers++;
                return;
            };
            radioBtn4 = document.getElementById("myRadio4").onclick = function () {
                if (answer == 3) {
                    console.log("Correct");
                    correctAnswers++;
                    return;
                }
            };

        }
    }

    function nextQuestion() {
        if (counter <= 5) {
            pickQuestion();
            return;
        }
        if (counter == 6) {
            console.log(correctAnswers)
            nextButton.innerHTML = "Result"

            nextButton.addEventListener("click", resultAnalyzer)
        }
    }
    function resultAnalyzer() {
        document.querySelector('#question').style.display = "none";
        document.querySelector('#option1').style.display = "none";
        document.querySelector('#option2').style.display = "none";
        document.querySelector('#option3').style.display = "none";
        document.querySelector('#option4').style.display = "none";
        count.style.display = "none";


        let myColoredChart = document.getElementById('myColoredChart').getContext('2d');

        let pieColoredChart = new Chart(myColoredChart, {
            type: 'pie',
            data: {
                labels: ['Wrong', 'Right'],
                datasets: [{
                    //label: 'test',
                    data: [
                        correctAnswers,
                        5 - correctAnswers
                    ],
                    backgroundColor: [
                        "red",
                        "lime"
                    ]
                }]
            },
            options: {

            }

        })
        document.querySelector('#quiz').style.display="none"
        var resultinpercentage = correctAnswers / 5 * 100;
        document.querySelector('#question').innerHTML="Correct answers: "+correctAnswers+"/5"+"<br>Result is: "+resultinpercentage+"%"   
        document.querySelector('#question').style.display = "block";
        document.querySelector('#nextbtn').style.display="none"
    }




})()