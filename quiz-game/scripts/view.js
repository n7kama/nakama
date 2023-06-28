import Question from './components/Question.js';
import HUD from './components/HUD.js';
import Skip from './components/Skip.js';
import Leaderboard from './components/Leaderboard.js';
import LeaderMenu from './components/LeaderMenu.js';

const renderDOM = (html) => document.getElementById('view').innerHTML = html; //Set HTML in view
const isTop5 = (score, top5) => top5.some(item => item.score < score);

export const StartMenu = (props) => {
    const { timer, score, topScores } = props;
    renderDOM(
        `${HUD(timer, score)}
${Leaderboard(topScores)}
<hr>
<button onclick='createGame()'>Play</button>`
    )
}

export const PlayScene = (props) => { //Function for HTML view
    const { timer, score, trivia } = props; //Destructure properties
    renderDOM( //Render the Scene's HTML to DOM
        `${HUD(timer, score)}
        ${Question(trivia)}
        ${Skip()}`
    )
}

export const GameoverScene = (props) => { //Function for HTML view
    const { timer, score, topScores } = props; //Destructure properties
    renderDOM( //render the Gameover HTML to DOM
        `${HUD(timer, score)}
        ${isTop5(score, topScores) ? LeaderMenu() : ''}
        <h1>Game Over!</h1>
        <button onclick='start()'>Start Menu</button>`
    )
}