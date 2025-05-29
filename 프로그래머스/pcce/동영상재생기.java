package pcce;

class 동영상재생기 {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        int videoTime = getTime(video_len);
        int currentTime = getTime(pos);
        int opStartTime = getTime(op_start);
        int opEndTime = getTime(op_end);

        currentTime = skipOpening(currentTime, opStartTime, opEndTime);
        for(int i=0; i<commands.length; i++) {
            switch(commands[i]) {
                case "next":
                    currentTime = skipOpening(Math.min(currentTime+10, videoTime), opStartTime, opEndTime);
                    break;
                case "prev":
                    currentTime = skipOpening(Math.max(currentTime-10, 0), opStartTime, opEndTime);
                    break;
            }
        }

        answer = String.format("%02d", currentTime/60) + ":" + String.format("%02d", currentTime%60);

        return answer;
    }

    public int skipOpening(int currentTime, int opStartTime, int opEndTime) {
        if((opStartTime <= currentTime) && (currentTime <= opEndTime)) {
            currentTime = opEndTime;
        }
        return currentTime;

    }
    public int getTime(String timeStr) {
        String[] timeStringList = timeStr.split(":");
        return Integer.parseInt(timeStringList[0])*60 + Integer.parseInt(timeStringList[1]);
    }
}