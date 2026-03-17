class WorkerThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread đang chạy...");
    }
}

class WorkerRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable đang chạy...");
    }
}