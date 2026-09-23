package solution

import (
	"strings"
	"testing"
)

func TestGcdOfStrings(t *testing.T) {
	tests := []struct {
		name string
		str1 string
		str2 string
		want string
	}{
		{"example_1", "ABCABC", "ABC", "ABC"},
		{"example_2", "ABABAB", "ABAB", "AB"},
		{"no_common_divisor", "LEET", "CODE", ""},
		{"matching_prefix_only", "AAAAAB", "AAA", ""},
		{"longest_not_first_match", "AAAA", "AAAAAAAA", "AAAA"},
		{"same_lengths_different_content", "ABABAB", "ACAC", ""},
		{"equal_strings", "ABC", "ABC", "ABC"},
		{"single_character", "A", "A", "A"},
		{"first_string_shorter", "AB", "ABABAB", "AB"},
		{"maximum_length", strings.Repeat("A", 1000), strings.Repeat("A", 1000), strings.Repeat("A", 1000)},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := gcdOfStrings(tt.str1, tt.str2); got != tt.want {
				t.Errorf("gcdOfStrings(%q, %q) = %q; want %q", tt.str1, tt.str2, got, tt.want)
			}
		})
	}
}
