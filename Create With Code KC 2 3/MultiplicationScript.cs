using System.Collections;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.SceneManagement;

public class MultiplicationScript : MonoBehaviour
{
    public Text questionText;
    public InputField answerInput;
    public Text scoreText;
    public Button playAgainButton; // Reference to the "Play Again" button

    private int num1;
    private int num2;
    private int answer;
    private string operatorSymbol;

    private bool showingFeedback = false;
    private int correctAnswers = 0;
    private int totalProblems = 0;

    void Start()
    {
        playAgainButton.gameObject.SetActive(false); // Hide the "Play Again" button initially
        scoreText.enabled = false;
        GenerateMultiplicationQuestion();
        answerInput.onEndEdit.AddListener(SubmitAnswer);
    }

    void SubmitAnswer(string userInput)
    {
        if (!showingFeedback)
        {
            int playerAnswer;
            bool isNumeric = int.TryParse(userInput, out playerAnswer);

            if (isNumeric)
            {
                showingFeedback = true;
                if (playerAnswer == answer)
                {
                    questionText.text = "Good Job!";
                    correctAnswers++;
                }
                else
                {
                    questionText.text = "Not Quite";
                }
                totalProblems++;

                if (totalProblems >= 10)
                {
                    DisplayScore();
                    playAgainButton.gameObject.SetActive(true); // Show the "Play Again" button
                }
                else
                {
                    StartCoroutine(ResetQuestionAfterDelay(3f));
                }
            }
            else
            {
                Debug.Log("Please enter a valid number.");
            }

            answerInput.text = "";
        }
    }

    IEnumerator ResetQuestionAfterDelay(float delay)
    {
        yield return new WaitForSeconds(delay);
        showingFeedback = false;
        GenerateMultiplicationQuestion();
    }

    void GenerateMultiplicationQuestion()
    {
        num1 = Random.Range(1, 13);
        num2 = Random.Range(1, 13);
        answer = num1 * num2;
        operatorSymbol = "x";
        DisplayQuestion();
    }

    void DisplayQuestion()
    {
        questionText.text = num1 + " " + operatorSymbol + " " + num2 + " = ?";
    }

    void DisplayScore()
    {
        scoreText.enabled = true;
        scoreText.text = "Your score: " + correctAnswers + " out of 10";
    }

    public void PlayAgain()
    {
        // Reload the current scene
        SceneManager.LoadScene(SceneManager.GetActiveScene().buildIndex);
    }
}


