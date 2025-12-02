import pandas as pd
import matplotlib.pyplot as plt

# Data
data = {
    "calcTest_before": [1.741, 1.0, 1.067, 1.329, 1.128],
    "triTest_before":  [0.002, 0.001, 0.002, 0.001, 0.002],
    "calcop_after":    [0.056, 0.06, 0.123, 0.055, 0.058],
    "triop_after":     [0.143, 0.138, 0.352, 0.153, 0.145]
}

# DataFrame
df = pd.DataFrame(data)

# Total times
df["total_before"] = df["calcTest_before"] + df["triTest_before"]
df["total_after"] = df["calcop_after"] + df["triop_after"]

print("=== Table of Results ===")
print(df)

df.to_csv("ekstazi_results.csv", index=False)


# Plot
plt.figure(figsize=(8,5))
plt.plot(df.index, df["total_before"], marker='o', label="Total Before Ekstazi")
plt.plot(df.index, df["total_after"], marker='o', label="Total After Ekstazi")

plt.xlabel("Run Index")
plt.ylabel("Time (seconds)")
plt.title("Before vs After Ekstazi Test Time")
plt.legend()
plt.tight_layout()
plt.savefig("ekstazi_times.png", dpi=300)
plt.show()
