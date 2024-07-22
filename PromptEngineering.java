0. Preconditional:
- LLM: Large Language Model
- LVM: Large Vision Model
- Generative AI: base on Gemini 

1. Define:
- PE: tổ hợp các methods để giao tiếp với LLM để lấy kết quả mong muốn mà ko cần update các model weights
- Tối ưu form PE giúp sử dụng LLM với nhiều ứng dụng khác nhau
- Format: <Intructions> <Context> <INput data> <Output Indicator>

2. Tasks covered:
2.1. Text Summarization
2.2. Information Extraction
2.3. Question Answering
2.4. Text Classification
2.5. Conversation
2.6. Code Generation
2.7. Reasoning: suy luận, nội suy, tính toán


3. Types:
3.1. Zero-shot: Q&A, prompt = Q;
3.2. Few-shot: examples +  Q&A, prompt = examples + Q. LLM có khả năng lọc nhiễu nếu user cho examples sai. Examples để định hướng, trainning cho model biết hướng xử lý.
3.3. CoT (Chain of Thought): exampless + explain + Q&A, prompt = exampless + explain + Q. Áp dụng cho các bài toán suy luận, nội suy, tính toán. (Arithmetic Reasoning, Symbolic Reasoning, Commonsence Reasoning)

4. Fukatsu style prompt:
